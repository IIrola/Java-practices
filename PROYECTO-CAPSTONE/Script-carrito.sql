USE [master]
GO
/****** Object:  Database [carritocompra]    Script Date: 9/05/2022 18:09:51 ******/
CREATE DATABASE [carritocompra]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'carritocompra', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\carritocompra.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'carritocompra_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\carritocompra_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [carritocompra] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [carritocompra].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [carritocompra] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [carritocompra] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [carritocompra] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [carritocompra] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [carritocompra] SET ARITHABORT OFF 
GO
ALTER DATABASE [carritocompra] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [carritocompra] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [carritocompra] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [carritocompra] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [carritocompra] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [carritocompra] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [carritocompra] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [carritocompra] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [carritocompra] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [carritocompra] SET  ENABLE_BROKER 
GO
ALTER DATABASE [carritocompra] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [carritocompra] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [carritocompra] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [carritocompra] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [carritocompra] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [carritocompra] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [carritocompra] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [carritocompra] SET RECOVERY FULL 
GO
ALTER DATABASE [carritocompra] SET  MULTI_USER 
GO
ALTER DATABASE [carritocompra] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [carritocompra] SET DB_CHAINING OFF 
GO
ALTER DATABASE [carritocompra] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [carritocompra] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [carritocompra] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [carritocompra] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'carritocompra', N'ON'
GO
ALTER DATABASE [carritocompra] SET QUERY_STORE = OFF
GO
USE [carritocompra]
GO
/****** Object:  Table [dbo].[CATEGORIA]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CATEGORIA](
	[cod_categoria] [int] IDENTITY(1,1) NOT NULL,
	[cate_descripcion] [varchar](20) NOT NULL,
 CONSTRAINT [PK_CE_CATEGORIA] PRIMARY KEY CLUSTERED 
(
	[cod_categoria] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CLIENTE]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CLIENTE](
	[cod_cliente] [int] IDENTITY(1,1) NOT NULL,
	[cod_auto_cliente]  AS ('CLI'+right('0000'+CONVERT([varchar](10),[cod_cliente]),(4))),
	[cli_nombre] [varchar](50) NOT NULL,
	[cli_ap_paterno] [varchar](20) NOT NULL,
	[cli_ap_materno] [varchar](20) NOT NULL,
	[cli_dni] [varchar](10) NOT NULL,
	[cli_celular] [varchar](10) NOT NULL,
	[cli_direccion] [varchar](50) NOT NULL,
	[correo] [varchar](50) NOT NULL,
	[password] [varchar](20) NOT NULL,
 CONSTRAINT [PK_CLIENTE] PRIMARY KEY CLUSTERED 
(
	[cod_cliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DETALLE]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DETALLE](
	[cod_detalle] [int] IDENTITY(1,1) NOT NULL,
	[cod_pedido] [int] NOT NULL,
	[cod_producto] [int] NOT NULL,
	[cantidad] [int] NOT NULL,
 CONSTRAINT [PK_DETALLE] PRIMARY KEY CLUSTERED 
(
	[cod_detalle] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ESTADO_PEDIDO]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ESTADO_PEDIDO](
	[cod_estado_pedido] [int] IDENTITY(1,1) NOT NULL,
	[estado_descripcion] [varchar](50) NOT NULL,
 CONSTRAINT [PK_ESTADO_PEDIDO] PRIMARY KEY CLUSTERED 
(
	[cod_estado_pedido] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PAGO]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PAGO](
	[cod_pago] [int] IDENTITY(1,1) NOT NULL,
	[pago_descripcion] [varchar](50) NOT NULL,
 CONSTRAINT [PK_CE_PAGO] PRIMARY KEY CLUSTERED 
(
	[cod_pago] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PEDIDO]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PEDIDO](
	[cod_pedido] [int] IDENTITY(1,1) NOT NULL,
	[cod_auto_pedido]  AS ('PE'+right('0000'+CONVERT([varchar](10),[cod_pedido]),(4))),
	[cod_estado_pedido] [int] NOT NULL,
	[ped_precio_envio] [float] NOT NULL,
	[ped_fecha_compra] [date] NOT NULL,
	[ped_fecha_envio] [date] NOT NULL,
	[cod_cliente] [int] NOT NULL,
	[cod_pago] [int] NOT NULL,
 CONSTRAINT [PK_CE_ORDEN_COMPRA] PRIMARY KEY CLUSTERED 
(
	[cod_pedido] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PRODUCTO]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PRODUCTO](
	[cod_producto] [int] IDENTITY(1,1) NOT NULL,
	[cod_auto_producto]  AS ('PR'+right('0000'+CONVERT([varchar](10),[cod_producto]),(4))),
	[prod_descripcion] [varchar](100) NOT NULL,
	[prod_precio] [float] NOT NULL,
	[prod_stock] [int] NOT NULL,
	[cod_categoria] [int] NOT NULL,
	[cod_proveedor] [int] NOT NULL,
 CONSTRAINT [PK_CE_PRODUCTO] PRIMARY KEY CLUSTERED 
(
	[cod_producto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[V_HISTORIAL_PEDIDOS]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[V_HISTORIAL_PEDIDOS]
AS
SELECT        DETALLE_1.cod_detalle, PEDIDO_1.cod_pedido, PEDIDO_1.cod_auto_pedido, CLIENTE_1.cod_cliente, CLIENTE_1.cli_nombre, CLIENTE_1.cli_ap_paterno, CLIENTE_1.cli_ap_materno, CLIENTE_1.cli_direccion, 
                         PRODUCTO_1.cod_categoria, dbo.CATEGORIA.cate_descripcion, DETALLE_1.cod_producto, PRODUCTO_1.prod_descripcion, PRODUCTO_1.prod_precio, DETALLE_1.cantidad, 
                         PRODUCTO_1.prod_precio * DETALLE_1.cantidad AS Sub_Total_Producto, PEDIDO_1.ped_precio_envio,
                             (SELECT        ROUND(SUM(dbo.PRODUCTO.prod_precio * dbo.DETALLE.cantidad), 2) AS Expr1
                               FROM            dbo.PEDIDO INNER JOIN
                                                         dbo.PAGO ON dbo.PEDIDO.cod_pago = dbo.PAGO.cod_pago INNER JOIN
                                                         dbo.ESTADO_PEDIDO ON dbo.PEDIDO.cod_estado_pedido = dbo.ESTADO_PEDIDO.cod_estado_pedido INNER JOIN
                                                         dbo.CLIENTE ON dbo.PEDIDO.cod_cliente = dbo.CLIENTE.cod_cliente INNER JOIN
                                                         dbo.DETALLE ON dbo.PEDIDO.cod_pedido = dbo.DETALLE.cod_pedido INNER JOIN
                                                         dbo.PRODUCTO ON dbo.DETALLE.cod_producto = dbo.PRODUCTO.cod_producto) AS Sub_Total_Pedido, '0.18' AS IGV, ROUND
                             ((SELECT        SUM(PRODUCTO_2.prod_precio * DETALLE_2.cantidad) AS Expr1
                                 FROM            dbo.PEDIDO AS PEDIDO_2 INNER JOIN
                                                          dbo.PAGO AS PAGO_2 ON PEDIDO_2.cod_pago = PAGO_2.cod_pago INNER JOIN
                                                          dbo.ESTADO_PEDIDO AS ESTADO_PEDIDO_2 ON PEDIDO_2.cod_estado_pedido = ESTADO_PEDIDO_2.cod_estado_pedido INNER JOIN
                                                          dbo.CLIENTE AS CLIENTE_2 ON PEDIDO_2.cod_cliente = CLIENTE_2.cod_cliente INNER JOIN
                                                          dbo.DETALLE AS DETALLE_2 ON PEDIDO_2.cod_pedido = DETALLE_2.cod_pedido INNER JOIN
                                                          dbo.PRODUCTO AS PRODUCTO_2 ON DETALLE_2.cod_producto = PRODUCTO_2.cod_producto) * 1.18 + PEDIDO_1.ped_precio_envio, 2) AS TOTAL_FINAL
FROM            dbo.PEDIDO AS PEDIDO_1 INNER JOIN
                         dbo.DETALLE AS DETALLE_1 ON PEDIDO_1.cod_pedido = DETALLE_1.cod_pedido INNER JOIN
                         dbo.CLIENTE AS CLIENTE_1 ON PEDIDO_1.cod_cliente = CLIENTE_1.cod_cliente INNER JOIN
                         dbo.PRODUCTO AS PRODUCTO_1 ON DETALLE_1.cod_producto = PRODUCTO_1.cod_producto INNER JOIN
                         dbo.CATEGORIA ON PRODUCTO_1.cod_categoria = dbo.CATEGORIA.cod_categoria INNER JOIN
                         dbo.PAGO AS PAGO_1 ON PEDIDO_1.cod_pago = PAGO_1.cod_pago INNER JOIN
                         dbo.ESTADO_PEDIDO AS ESTADO_PEDIDO_1 ON PEDIDO_1.cod_estado_pedido = ESTADO_PEDIDO_1.cod_estado_pedido



GO
/****** Object:  View [dbo].[V_PEDIDO_1_LINEA]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[V_PEDIDO_1_LINEA]
AS
SELECT        TOP (100) PERCENT dbo.PEDIDO.cod_pedido, dbo.PEDIDO.cod_auto_pedido, dbo.PEDIDO.ped_fecha_compra, dbo.PEDIDO.ped_fecha_envio, dbo.PEDIDO.cod_pago, dbo.PAGO.pago_descripcion, 
                         dbo.PEDIDO.cod_estado_pedido, dbo.ESTADO_PEDIDO.estado_descripcion, dbo.CLIENTE.cod_cliente, ROUND(SUM(dbo.PRODUCTO.prod_precio * dbo.DETALLE.cantidad), 2) AS Sub_total, dbo.PEDIDO.ped_precio_envio, 
                         ROUND(SUM(dbo.PRODUCTO.prod_precio * dbo.DETALLE.cantidad) * 1.18 + dbo.PEDIDO.ped_precio_envio, 2) AS Total
FROM            dbo.PEDIDO INNER JOIN
                         dbo.PAGO ON dbo.PEDIDO.cod_pago = dbo.PAGO.cod_pago INNER JOIN
                         dbo.ESTADO_PEDIDO ON dbo.PEDIDO.cod_estado_pedido = dbo.ESTADO_PEDIDO.cod_estado_pedido INNER JOIN
                         dbo.CLIENTE ON dbo.PEDIDO.cod_cliente = dbo.CLIENTE.cod_cliente INNER JOIN
                         dbo.DETALLE ON dbo.PEDIDO.cod_pedido = dbo.DETALLE.cod_pedido INNER JOIN
                         dbo.PRODUCTO ON dbo.DETALLE.cod_producto = dbo.PRODUCTO.cod_producto
GROUP BY dbo.PEDIDO.cod_pedido, dbo.PEDIDO.cod_auto_pedido, dbo.PEDIDO.ped_fecha_compra, dbo.PEDIDO.ped_fecha_envio, dbo.PEDIDO.cod_pago, dbo.PAGO.pago_descripcion, dbo.PEDIDO.cod_estado_pedido, 
                         dbo.ESTADO_PEDIDO.estado_descripcion, dbo.CLIENTE.cod_cliente, dbo.PEDIDO.ped_precio_envio
ORDER BY dbo.PEDIDO.cod_pedido DESC


GO
/****** Object:  Table [dbo].[PROVEEDOR]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PROVEEDOR](
	[cod_proveedor] [int] IDENTITY(1,1) NOT NULL,
	[prov_razon] [varchar](50) NOT NULL,
	[prov_ruc] [varchar](11) NOT NULL,
	[prov_celular] [varchar](10) NOT NULL,
	[prov_correo] [varchar](50) NOT NULL,
 CONSTRAINT [PK_CE_PROVEEDOR] PRIMARY KEY CLUSTERED 
(
	[cod_proveedor] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[VISTA_PRODUCTOS_TIENDA_EJEMPLO]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[VISTA_PRODUCTOS_TIENDA_EJEMPLO]
AS
SELECT        dbo.PRODUCTO.cod_producto, dbo.PRODUCTO.cod_auto_producto, dbo.PRODUCTO.prod_descripcion, dbo.PRODUCTO.prod_precio, dbo.PRODUCTO.prod_stock, dbo.PRODUCTO.cod_categoria, dbo.PRODUCTO.cod_proveedor, 
                         dbo.CATEGORIA.cate_descripcion, dbo.PROVEEDOR.prov_razon
FROM            dbo.PRODUCTO INNER JOIN
                         dbo.CATEGORIA ON dbo.PRODUCTO.cod_categoria = dbo.CATEGORIA.cod_categoria INNER JOIN
                         dbo.PROVEEDOR ON dbo.PRODUCTO.cod_proveedor = dbo.PROVEEDOR.cod_proveedor





GO
SET IDENTITY_INSERT [dbo].[CATEGORIA] ON 

INSERT [dbo].[CATEGORIA] ([cod_categoria], [cate_descripcion]) VALUES (7, N'accesorios')
INSERT [dbo].[CATEGORIA] ([cod_categoria], [cate_descripcion]) VALUES (3, N'cuaderno')
INSERT [dbo].[CATEGORIA] ([cod_categoria], [cate_descripcion]) VALUES (8, N'libros')
INSERT [dbo].[CATEGORIA] ([cod_categoria], [cate_descripcion]) VALUES (1, N'manualidades')
INSERT [dbo].[CATEGORIA] ([cod_categoria], [cate_descripcion]) VALUES (6, N'marcadores    ')
INSERT [dbo].[CATEGORIA] ([cod_categoria], [cate_descripcion]) VALUES (4, N'oficina')
INSERT [dbo].[CATEGORIA] ([cod_categoria], [cate_descripcion]) VALUES (5, N'papeleria')
INSERT [dbo].[CATEGORIA] ([cod_categoria], [cate_descripcion]) VALUES (2, N'uniforme')
SET IDENTITY_INSERT [dbo].[CATEGORIA] OFF
GO
SET IDENTITY_INSERT [dbo].[CLIENTE] ON 

INSERT [dbo].[CLIENTE] ([cod_cliente], [cli_nombre], [cli_ap_paterno], [cli_ap_materno], [cli_dni], [cli_celular], [cli_direccion], [correo], [password]) VALUES (3, N'Isaac Jehiel', N'Morales ', N'Morales', N'10291821', N'Mz H Lte 1', N'989878672', N'isaacjehiel1998@hotmail.com', N'isaacjehiel')
INSERT [dbo].[CLIENTE] ([cod_cliente], [cli_nombre], [cli_ap_paterno], [cli_ap_materno], [cli_dni], [cli_celular], [cli_direccion], [correo], [password]) VALUES (4, N'Elias', N'Chero', N'Erazo', N'10204060', N'Jr. Ucayal', N'989876785', N'elias@hotmai.com', N'123456')
INSERT [dbo].[CLIENTE] ([cod_cliente], [cli_nombre], [cli_ap_paterno], [cli_ap_materno], [cli_dni], [cli_celular], [cli_direccion], [correo], [password]) VALUES (11, N'Yomer', N'Angeles', N'Angel', N'12345678', N'Av. Lima 1', N'987625367', N'yomer@hotmail.com', N'123456')
SET IDENTITY_INSERT [dbo].[CLIENTE] OFF
GO
SET IDENTITY_INSERT [dbo].[DETALLE] ON 

INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (1, 3, 7, 9)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (2, 3, 11, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (3, 4, 8, 3)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (4, 5, 7, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (5, 6, 7, 2)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (6, 6, 9, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (7, 6, 10, 2)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (8, 6, 8, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (9, 7, 7, 6)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (10, 8, 7, 2)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (11, 9, 7, 3)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (12, 9, 8, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (13, 9, 15, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (14, 10, 7, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (15, 10, 9, 2)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (16, 11, 7, 2)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (17, 11, 8, 2)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (18, 11, 11, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (19, 12, 7, 2)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (20, 13, 7, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (21, 14, 7, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (22, 14, 8, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (23, 14, 9, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (24, 15, 7, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (25, 15, 9, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (26, 15, 17, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (27, 15, 11, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (28, 16, 7, 2)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (29, 17, 15, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (30, 17, 7, 1)
INSERT [dbo].[DETALLE] ([cod_detalle], [cod_pedido], [cod_producto], [cantidad]) VALUES (31, 17, 8, 1)
SET IDENTITY_INSERT [dbo].[DETALLE] OFF
GO
SET IDENTITY_INSERT [dbo].[ESTADO_PEDIDO] ON 

INSERT [dbo].[ESTADO_PEDIDO] ([cod_estado_pedido], [estado_descripcion]) VALUES (1, N'PENDIENTE')
INSERT [dbo].[ESTADO_PEDIDO] ([cod_estado_pedido], [estado_descripcion]) VALUES (2, N'CANCELADO')
INSERT [dbo].[ESTADO_PEDIDO] ([cod_estado_pedido], [estado_descripcion]) VALUES (3, N'ENTREGADO')
INSERT [dbo].[ESTADO_PEDIDO] ([cod_estado_pedido], [estado_descripcion]) VALUES (4, N'REEMBOLSO')
SET IDENTITY_INSERT [dbo].[ESTADO_PEDIDO] OFF
GO
SET IDENTITY_INSERT [dbo].[PAGO] ON 

INSERT [dbo].[PAGO] ([cod_pago], [pago_descripcion]) VALUES (3, N'CONTRA ENTREGA')
INSERT [dbo].[PAGO] ([cod_pago], [pago_descripcion]) VALUES (1, N'CREDITO')
INSERT [dbo].[PAGO] ([cod_pago], [pago_descripcion]) VALUES (2, N'DEBITO')
INSERT [dbo].[PAGO] ([cod_pago], [pago_descripcion]) VALUES (4, N'PAYPAL')
INSERT [dbo].[PAGO] ([cod_pago], [pago_descripcion]) VALUES (5, N'YAPE')
SET IDENTITY_INSERT [dbo].[PAGO] OFF
GO
SET IDENTITY_INSERT [dbo].[PEDIDO] ON 

INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (3, 1, 10, CAST(N'2022-05-06' AS Date), CAST(N'2022-05-09' AS Date), 3, 1)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (4, 1, 10, CAST(N'2022-05-06' AS Date), CAST(N'2022-05-12' AS Date), 3, 1)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (5, 1, 10, CAST(N'2022-05-06' AS Date), CAST(N'2022-05-15' AS Date), 3, 4)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (6, 1, 10, CAST(N'2022-05-06' AS Date), CAST(N'2022-05-18' AS Date), 3, 1)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (7, 1, 10, CAST(N'2022-05-07' AS Date), CAST(N'2022-05-21' AS Date), 3, 2)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (8, 1, 10, CAST(N'2022-05-07' AS Date), CAST(N'2022-05-24' AS Date), 3, 3)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (9, 1, 10, CAST(N'2022-05-07' AS Date), CAST(N'2022-05-27' AS Date), 3, 1)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (10, 1, 10, CAST(N'2022-05-07' AS Date), CAST(N'2022-05-30' AS Date), 3, 2)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (11, 1, 10, CAST(N'2022-05-07' AS Date), CAST(N'2022-06-02' AS Date), 3, 1)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (12, 1, 10, CAST(N'2022-05-07' AS Date), CAST(N'2022-06-05' AS Date), 3, 1)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (13, 1, 10, CAST(N'2022-05-08' AS Date), CAST(N'2022-05-11' AS Date), 3, 1)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (14, 1, 10, CAST(N'2022-05-09' AS Date), CAST(N'2022-05-12' AS Date), 4, 1)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (15, 1, 10, CAST(N'2022-05-09' AS Date), CAST(N'2022-05-15' AS Date), 4, 1)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (16, 1, 10, CAST(N'2022-05-09' AS Date), CAST(N'2022-05-12' AS Date), 3, 1)
INSERT [dbo].[PEDIDO] ([cod_pedido], [cod_estado_pedido], [ped_precio_envio], [ped_fecha_compra], [ped_fecha_envio], [cod_cliente], [cod_pago]) VALUES (17, 1, 10, CAST(N'2022-05-09' AS Date), CAST(N'2022-05-15' AS Date), 11, 1)
SET IDENTITY_INSERT [dbo].[PEDIDO] OFF
GO
SET IDENTITY_INSERT [dbo].[PRODUCTO] ON 

INSERT [dbo].[PRODUCTO] ([cod_producto], [prod_descripcion], [prod_precio], [prod_stock], [cod_categoria], [cod_proveedor]) VALUES (7, N'Pinceles', 10, 5, 1, 1)
INSERT [dbo].[PRODUCTO] ([cod_producto], [prod_descripcion], [prod_precio], [prod_stock], [cod_categoria], [cod_proveedor]) VALUES (8, N'Niño  talla M', 90, 40, 2, 1)
INSERT [dbo].[PRODUCTO] ([cod_producto], [prod_descripcion], [prod_precio], [prod_stock], [cod_categoria], [cod_proveedor]) VALUES (9, N'Alpha A4', 6, 40, 3, 1)
INSERT [dbo].[PRODUCTO] ([cod_producto], [prod_descripcion], [prod_precio], [prod_stock], [cod_categoria], [cod_proveedor]) VALUES (10, N'Carpeta A4', 10, 40, 4, 1)
INSERT [dbo].[PRODUCTO] ([cod_producto], [prod_descripcion], [prod_precio], [prod_stock], [cod_categoria], [cod_proveedor]) VALUES (11, N'Hojas Bond  millar', 20, 40, 5, 1)
INSERT [dbo].[PRODUCTO] ([cod_producto], [prod_descripcion], [prod_precio], [prod_stock], [cod_categoria], [cod_proveedor]) VALUES (15, N'Lapicero Pilot', 3, 40, 6, 1)
INSERT [dbo].[PRODUCTO] ([cod_producto], [prod_descripcion], [prod_precio], [prod_stock], [cod_categoria], [cod_proveedor]) VALUES (16, N'Cartuchera', 32, 40, 7, 1)
INSERT [dbo].[PRODUCTO] ([cod_producto], [prod_descripcion], [prod_precio], [prod_stock], [cod_categoria], [cod_proveedor]) VALUES (17, N'Diccionario "Bruno" 2020', 25, 40, 8, 1)
SET IDENTITY_INSERT [dbo].[PRODUCTO] OFF
GO
SET IDENTITY_INSERT [dbo].[PROVEEDOR] ON 

INSERT [dbo].[PROVEEDOR] ([cod_proveedor], [prov_razon], [prov_ruc], [prov_celular], [prov_correo]) VALUES (1, N'galeria_preciado', N'12345678912', N'958947631', N'galeria@gmail.com')
INSERT [dbo].[PROVEEDOR] ([cod_proveedor], [prov_razon], [prov_ruc], [prov_celular], [prov_correo]) VALUES (2, N'galeria Walla', N'74651650000', N'987654321', N'provewalla@gmail.com')
INSERT [dbo].[PROVEEDOR] ([cod_proveedor], [prov_razon], [prov_ruc], [prov_celular], [prov_correo]) VALUES (3, N'ARQ-CENTER SAC', N'98283736152', N'998882828', N'lima@gmail.com')
SET IDENTITY_INSERT [dbo].[PROVEEDOR] OFF
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ_CATEGORIA_DESCRIPCION]    Script Date: 9/05/2022 18:09:52 ******/
ALTER TABLE [dbo].[CATEGORIA] ADD  CONSTRAINT [UQ_CATEGORIA_DESCRIPCION] UNIQUE NONCLUSTERED 
(
	[cate_descripcion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ_CLIENTE_CELULAR]    Script Date: 9/05/2022 18:09:52 ******/
ALTER TABLE [dbo].[CLIENTE] ADD  CONSTRAINT [UQ_CLIENTE_CELULAR] UNIQUE NONCLUSTERED 
(
	[cli_celular] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ_CLIENTE_CORREO]    Script Date: 9/05/2022 18:09:52 ******/
ALTER TABLE [dbo].[CLIENTE] ADD  CONSTRAINT [UQ_CLIENTE_CORREO] UNIQUE NONCLUSTERED 
(
	[correo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ_CLIENTE_DNI]    Script Date: 9/05/2022 18:09:52 ******/
ALTER TABLE [dbo].[CLIENTE] ADD  CONSTRAINT [UQ_CLIENTE_DNI] UNIQUE NONCLUSTERED 
(
	[cli_dni] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ_PAGO_DESCRIPCION]    Script Date: 9/05/2022 18:09:52 ******/
ALTER TABLE [dbo].[PAGO] ADD  CONSTRAINT [UQ_PAGO_DESCRIPCION] UNIQUE NONCLUSTERED 
(
	[pago_descripcion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ_PROVE_CELULAR]    Script Date: 9/05/2022 18:09:52 ******/
ALTER TABLE [dbo].[PROVEEDOR] ADD  CONSTRAINT [UQ_PROVE_CELULAR] UNIQUE NONCLUSTERED 
(
	[prov_celular] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ_PROVE_CORREO]    Script Date: 9/05/2022 18:09:52 ******/
ALTER TABLE [dbo].[PROVEEDOR] ADD  CONSTRAINT [UQ_PROVE_CORREO] UNIQUE NONCLUSTERED 
(
	[prov_correo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ_PROVE_RAZON]    Script Date: 9/05/2022 18:09:52 ******/
ALTER TABLE [dbo].[PROVEEDOR] ADD  CONSTRAINT [UQ_PROVE_RAZON] UNIQUE NONCLUSTERED 
(
	[prov_razon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ_PROVE_RUC]    Script Date: 9/05/2022 18:09:52 ******/
ALTER TABLE [dbo].[PROVEEDOR] ADD  CONSTRAINT [UQ_PROVE_RUC] UNIQUE NONCLUSTERED 
(
	[prov_ruc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[PEDIDO] ADD  CONSTRAINT [df_estado_pedido]  DEFAULT ((1)) FOR [cod_estado_pedido]
GO
ALTER TABLE [dbo].[PEDIDO] ADD  CONSTRAINT [df_cost_envio]  DEFAULT ((10)) FOR [ped_precio_envio]
GO
ALTER TABLE [dbo].[PEDIDO] ADD  CONSTRAINT [DF_PEDIDO_ped_fecha_compra]  DEFAULT (getdate()) FOR [ped_fecha_compra]
GO
ALTER TABLE [dbo].[DETALLE]  WITH CHECK ADD  CONSTRAINT [FK_DETALLE_PEDIDO] FOREIGN KEY([cod_pedido])
REFERENCES [dbo].[PEDIDO] ([cod_pedido])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[DETALLE] CHECK CONSTRAINT [FK_DETALLE_PEDIDO]
GO
ALTER TABLE [dbo].[DETALLE]  WITH CHECK ADD  CONSTRAINT [FK_DETALLE_PRODUCTO] FOREIGN KEY([cod_producto])
REFERENCES [dbo].[PRODUCTO] ([cod_producto])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[DETALLE] CHECK CONSTRAINT [FK_DETALLE_PRODUCTO]
GO
ALTER TABLE [dbo].[PEDIDO]  WITH CHECK ADD  CONSTRAINT [FK_PEDIDO_CLIENTE] FOREIGN KEY([cod_cliente])
REFERENCES [dbo].[CLIENTE] ([cod_cliente])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PEDIDO] CHECK CONSTRAINT [FK_PEDIDO_CLIENTE]
GO
ALTER TABLE [dbo].[PEDIDO]  WITH CHECK ADD  CONSTRAINT [FK_PEDIDO_ESTADO_PEDIDO] FOREIGN KEY([cod_estado_pedido])
REFERENCES [dbo].[ESTADO_PEDIDO] ([cod_estado_pedido])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PEDIDO] CHECK CONSTRAINT [FK_PEDIDO_ESTADO_PEDIDO]
GO
ALTER TABLE [dbo].[PEDIDO]  WITH CHECK ADD  CONSTRAINT [FK_PEDIDO_PAGO] FOREIGN KEY([cod_pago])
REFERENCES [dbo].[PAGO] ([cod_pago])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PEDIDO] CHECK CONSTRAINT [FK_PEDIDO_PAGO]
GO
ALTER TABLE [dbo].[PRODUCTO]  WITH CHECK ADD  CONSTRAINT [FK_PRODUCTO_CATEGORIA] FOREIGN KEY([cod_categoria])
REFERENCES [dbo].[CATEGORIA] ([cod_categoria])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PRODUCTO] CHECK CONSTRAINT [FK_PRODUCTO_CATEGORIA]
GO
ALTER TABLE [dbo].[PRODUCTO]  WITH CHECK ADD  CONSTRAINT [FK_PRODUCTO_PROVEEDOR] FOREIGN KEY([cod_proveedor])
REFERENCES [dbo].[PROVEEDOR] ([cod_proveedor])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PRODUCTO] CHECK CONSTRAINT [FK_PRODUCTO_PROVEEDOR]
GO
/****** Object:  StoredProcedure [dbo].[actualizar_cliente]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[actualizar_cliente](
 @cod_cliente int,
 @cli_nombre VARCHAR(50),
 @cli_ap_paterno varchar(20), 
 @cli_ap_materno varchar(20), 
 @cli_dni varchar(10),
 @cli_celular varchar(10),
 @cli_direccion varchar(50),
 @correo varchar(50),
 @passwordd varchar(20)
)
AS
UPDATE cliente SET cli_nombre=@cli_nombre,cli_ap_paterno=@cli_ap_paterno,cli_ap_materno=@cli_ap_materno,
                         cli_dni=@cli_dni,cli_celular=@cli_celular,cli_direccion=@cli_direccion,correo=@correo,
                        password=@passwordd
                        WHERE cod_cliente = @cod_cliente



GO
/****** Object:  StoredProcedure [dbo].[actualizar_producto]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE  PROC [dbo].[actualizar_producto](
 @cod_producto int,
 @prod_descripcion VARCHAR(100),
 @prod_precio float, 
 @prod_stock int, 
 @cate_descripcion int,
 @prov_razon int
)
AS
UPDATE PRODUCTO SET prod_descripcion=@prod_descripcion,
					prod_precio=@prod_precio,
                    prod_stock=@prod_stock,
					cod_categoria=@cate_descripcion,
					cod_proveedor=@prov_razon
				WHERE cod_producto = @cod_producto 



GO
/****** Object:  StoredProcedure [dbo].[actualizar_proveedor]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[actualizar_proveedor](
 @cod_proveedor int,
 @prov_razon VARCHAR(50),
 @prov_ruc varchar(11), 
 @prov_celular varchar(10), 
 @prov_correo varchar(50)
)
AS
UPDATE PROVEEDOR SET prov_razon=@prov_razon,prov_ruc=@prov_ruc,prov_celular=@prov_celular,
                    prov_correo=@prov_correo
				WHERE cod_proveedor = @cod_proveedor



GO
/****** Object:  StoredProcedure [dbo].[borrar_producto]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[borrar_producto]
@cod_producto int
AS
DELETE FROM PRODUCTO WHERE cod_producto = @cod_producto



GO
/****** Object:  StoredProcedure [dbo].[borrar_proveedor]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create PROC [dbo].[borrar_proveedor]
@cod_proveedor int
AS
DELETE FROM PROVEEDOR WHERE cod_proveedor = @cod_proveedor



GO
/****** Object:  StoredProcedure [dbo].[insertar_cliente]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[insertar_cliente](
@cli_nombre varchar(50),
@cli_ap_paterno varchar(20),
@cli_ap_materno varchar(20),
@cli_dni varchar(10),
@cli_celular varchar(10),
@cli_direccion varchar(50),
@correo varchar(50),
@password varchar(20)
)
AS
BEGIN
	insert into cliente(cli_nombre,cli_ap_paterno,cli_ap_materno,cli_dni,cli_celular,cli_direccion,correo,password) 
	VALUES (@cli_nombre,@cli_ap_paterno,@cli_ap_materno,@cli_dni,@cli_celular,@cli_direccion,@correo,@password)
END 




GO
/****** Object:  StoredProcedure [dbo].[INSERTAR_PEDIDO_CODIGO]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[INSERTAR_PEDIDO_CODIGO] (
@ped_fecha_envio varchar(20),
@cod_cliente int,
@cod_pago int,
@MOSTRAR_COD_PEDIDO INT OUTPUT 
)
AS
BEGIN
	insert into pedido(ped_fecha_envio,cod_cliente,cod_pago) VALUES (@ped_fecha_envio,@cod_cliente,@cod_pago)
	SET @MOSTRAR_COD_PEDIDO=SCOPE_IDENTITY()
	PRINT @MOSTRAR_COD_PEDIDO
END 





GO
/****** Object:  StoredProcedure [dbo].[insertar_producto]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[insertar_producto](
@prod_descripcion varchar(100),
@prod_precio float,
@prod_stock int,
@cod_categoria int,
@cod_proveedor int
)
AS
BEGIN
	insert into producto(prod_descripcion,prod_precio,prod_stock,cod_categoria,cod_proveedor)
	VALUES (@prod_descripcion,@prod_precio,@prod_stock,@cod_categoria,@cod_proveedor)
END 



GO
/****** Object:  StoredProcedure [dbo].[insertar_proveedor]    Script Date: 9/05/2022 18:09:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[insertar_proveedor](
@prov_razon varchar(50),
@prov_ruc varchar(11),
@prov_celular varchar(10),
@prov_correo varchar(50)
)
AS
BEGIN
	insert into PROVEEDOR(prov_razon,prov_ruc,prov_celular,prov_correo)
	VALUES (@prov_razon,@prov_ruc,@prov_celular,@prov_correo)
END 




GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[10] 4[17] 2[28] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = -96
         Left = -96
      End
      Begin Tables = 
         Begin Table = "PEDIDO_1"
            Begin Extent = 
               Top = 82
               Left = 246
               Bottom = 240
               Right = 454
            End
            DisplayFlags = 280
            TopColumn = 1
         End
         Begin Table = "DETALLE_1"
            Begin Extent = 
               Top = 0
               Left = 477
               Bottom = 130
               Right = 628
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "CLIENTE_1"
            Begin Extent = 
               Top = 253
               Left = 472
               Bottom = 399
               Right = 680
            End
            DisplayFlags = 280
            TopColumn = 3
         End
         Begin Table = "PRODUCTO_1"
            Begin Extent = 
               Top = 0
               Left = 669
               Bottom = 183
               Right = 864
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "CATEGORIA"
            Begin Extent = 
               Top = 140
               Left = 475
               Bottom = 236
               Right = 651
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "PAGO_1"
            Begin Extent = 
               Top = 106
               Left = 0
               Bottom = 202
               Right = 208
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "ESTADO_PEDIDO_1"
            Begin Extent = 
               Top = 0
               Left = 0
               Bottom = 96
               Right = 208
            End
            Dis' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_HISTORIAL_PEDIDOS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane2', @value=N'playFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
      Begin ColumnWidths = 20
         Width = 284
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1980
         Width = 1425
         Width = 1500
         Width = 900
         Width = 1500
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 6735
         Alias = 2460
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_HISTORIAL_PEDIDOS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=2 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_HISTORIAL_PEDIDOS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[6] 4[45] 2[14] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = -96
         Left = 0
      End
      Begin Tables = 
         Begin Table = "PEDIDO"
            Begin Extent = 
               Top = 12
               Left = 272
               Bottom = 266
               Right = 480
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "PAGO"
            Begin Extent = 
               Top = 95
               Left = 0
               Bottom = 202
               Right = 179
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "ESTADO_PEDIDO"
            Begin Extent = 
               Top = 0
               Left = 0
               Bottom = 96
               Right = 181
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "CLIENTE"
            Begin Extent = 
               Top = 201
               Left = 0
               Bottom = 392
               Right = 181
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "DETALLE"
            Begin Extent = 
               Top = 48
               Left = 535
               Bottom = 205
               Right = 743
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "PRODUCTO"
            Begin Extent = 
               Top = 269
               Left = 265
               Bottom = 465
               Right = 473
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
      Begin ColumnWidths = 13
         Width = 284
         Width = 1500
         Width = 1500
      ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_PEDIDO_1_LINEA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane2', @value=N'   Width = 1500
         Width = 1500
         Width = 1485
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 12
         Column = 10140
         Alias = 900
         Table = 3600
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_PEDIDO_1_LINEA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=2 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_PEDIDO_1_LINEA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[30] 4[8] 2[19] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = -192
         Left = 0
      End
      Begin Tables = 
         Begin Table = "PRODUCTO"
            Begin Extent = 
               Top = 0
               Left = 148
               Bottom = 190
               Right = 356
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "CATEGORIA"
            Begin Extent = 
               Top = 6
               Left = 394
               Bottom = 130
               Right = 602
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "PROVEEDOR"
            Begin Extent = 
               Top = 132
               Left = 394
               Bottom = 262
               Right = 602
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
      Begin ColumnWidths = 10
         Width = 284
         Width = 1500
         Width = 3615
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VISTA_PRODUCTOS_TIENDA_EJEMPLO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VISTA_PRODUCTOS_TIENDA_EJEMPLO'
GO
USE [master]
GO
ALTER DATABASE [carritocompra] SET  READ_WRITE 
GO
