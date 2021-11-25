USE [TaskManagement]
GO
ALTER TABLE [dbo].[User] DROP CONSTRAINT [FK_User_Role]
GO
ALTER TABLE [dbo].[Task_Tag] DROP CONSTRAINT [FK_Task_Tag_Task]
GO
ALTER TABLE [dbo].[Task_Tag] DROP CONSTRAINT [FK_Task_Tag_Tag]
GO
ALTER TABLE [dbo].[Task_Meta] DROP CONSTRAINT [FK_Task_Meta_Task]
GO
ALTER TABLE [dbo].[Task] DROP CONSTRAINT [FK_Task_User2]
GO
ALTER TABLE [dbo].[Task] DROP CONSTRAINT [FK_Task_User1]
GO
ALTER TABLE [dbo].[Task] DROP CONSTRAINT [FK_Task_User]
GO
ALTER TABLE [dbo].[Task] DROP CONSTRAINT [FK_Task_Project]
GO
ALTER TABLE [dbo].[Project] DROP CONSTRAINT [FK_Project_User1]
GO
ALTER TABLE [dbo].[Project] DROP CONSTRAINT [FK_Project_User]
GO
ALTER TABLE [dbo].[Comment] DROP CONSTRAINT [FK_Comment_Task]
GO
ALTER TABLE [dbo].[Comment] DROP CONSTRAINT [FK_Comment_Activity]
GO
ALTER TABLE [dbo].[Activity] DROP CONSTRAINT [FK_Activity_User2]
GO
ALTER TABLE [dbo].[Activity] DROP CONSTRAINT [FK_Activity_User1]
GO
ALTER TABLE [dbo].[Activity] DROP CONSTRAINT [FK_Activity_User]
GO
ALTER TABLE [dbo].[Activity] DROP CONSTRAINT [FK_Activity_Task]
GO
/****** Object:  Table [dbo].[User]    Script Date: 25/11/2021 18:57:38 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[User]') AND type in (N'U'))
DROP TABLE [dbo].[User]
GO
/****** Object:  Table [dbo].[Task_Tag]    Script Date: 25/11/2021 18:57:38 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Task_Tag]') AND type in (N'U'))
DROP TABLE [dbo].[Task_Tag]
GO
/****** Object:  Table [dbo].[Task_Meta]    Script Date: 25/11/2021 18:57:38 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Task_Meta]') AND type in (N'U'))
DROP TABLE [dbo].[Task_Meta]
GO
/****** Object:  Table [dbo].[Task]    Script Date: 25/11/2021 18:57:38 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Task]') AND type in (N'U'))
DROP TABLE [dbo].[Task]
GO
/****** Object:  Table [dbo].[Tag]    Script Date: 25/11/2021 18:57:38 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Tag]') AND type in (N'U'))
DROP TABLE [dbo].[Tag]
GO
/****** Object:  Table [dbo].[Role]    Script Date: 25/11/2021 18:57:38 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Role]') AND type in (N'U'))
DROP TABLE [dbo].[Role]
GO
/****** Object:  Table [dbo].[Project]    Script Date: 25/11/2021 18:57:38 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Project]') AND type in (N'U'))
DROP TABLE [dbo].[Project]
GO
/****** Object:  Table [dbo].[Comment]    Script Date: 25/11/2021 18:57:38 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Comment]') AND type in (N'U'))
DROP TABLE [dbo].[Comment]
GO
/****** Object:  Table [dbo].[Activity]    Script Date: 25/11/2021 18:57:38 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Activity]') AND type in (N'U'))
DROP TABLE [dbo].[Activity]
GO
USE [master]
GO
/****** Object:  Database [TaskManagement]    Script Date: 25/11/2021 18:57:38 ******/
DROP DATABASE [TaskManagement]
GO
/****** Object:  Database [TaskManagement]    Script Date: 25/11/2021 18:57:38 ******/
CREATE DATABASE [TaskManagement]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'TaskManagement', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\TaskManagement.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'TaskManagement_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\TaskManagement_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [TaskManagement] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [TaskManagement].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [TaskManagement] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [TaskManagement] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [TaskManagement] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [TaskManagement] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [TaskManagement] SET ARITHABORT OFF 
GO
ALTER DATABASE [TaskManagement] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [TaskManagement] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [TaskManagement] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [TaskManagement] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [TaskManagement] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [TaskManagement] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [TaskManagement] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [TaskManagement] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [TaskManagement] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [TaskManagement] SET  DISABLE_BROKER 
GO
ALTER DATABASE [TaskManagement] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [TaskManagement] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [TaskManagement] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [TaskManagement] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [TaskManagement] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [TaskManagement] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [TaskManagement] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [TaskManagement] SET RECOVERY FULL 
GO
ALTER DATABASE [TaskManagement] SET  MULTI_USER 
GO
ALTER DATABASE [TaskManagement] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [TaskManagement] SET DB_CHAINING OFF 
GO
ALTER DATABASE [TaskManagement] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [TaskManagement] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [TaskManagement] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [TaskManagement] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'TaskManagement', N'ON'
GO
ALTER DATABASE [TaskManagement] SET QUERY_STORE = OFF
GO
USE [TaskManagement]
GO
/****** Object:  Table [dbo].[Activity]    Script Date: 25/11/2021 18:57:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Activity](
	[id] [int] NOT NULL,
	[userId] [int] NOT NULL,
	[taskId] [int] NOT NULL,
	[createdBy] [int] NOT NULL,
	[updatedBy] [int] NOT NULL,
	[title] [varchar](512) NOT NULL,
	[description] [text] NULL,
	[status] [int] NOT NULL,
	[hours] [float] NOT NULL,
	[createdAt] [datetime] NOT NULL,
	[updatedAt] [datetime] NOT NULL,
	[plannedStartDate] [datetime] NOT NULL,
	[plannedEndDate] [datetime] NOT NULL,
	[actualStartDate] [datetime] NULL,
	[actualEndDate] [datetime] NULL,
	[content] [text] NULL,
 CONSTRAINT [PK_Activity] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Comment]    Script Date: 25/11/2021 18:57:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Comment](
	[id] [int] NOT NULL,
	[taskId] [int] NOT NULL,
	[activityId] [int] NOT NULL,
	[title] [varchar](100) NOT NULL,
	[createdAt] [datetime] NOT NULL,
	[updatedAt] [datetime] NOT NULL,
	[content] [text] NOT NULL,
 CONSTRAINT [PK_Comment] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Project]    Script Date: 25/11/2021 18:57:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Project](
	[id] [int] NOT NULL,
	[title] [varchar](500) NOT NULL,
	[description] [text] NULL,
	[createdBy] [int] NOT NULL,
	[updatedBy] [int] NOT NULL,
	[status] [int] NOT NULL,
	[hours] [int] NOT NULL,
	[createdAt] [datetime] NOT NULL,
	[updatedAt] [datetime] NOT NULL,
	[plannedStartDate] [datetime] NOT NULL,
	[plannedEndDate] [datetime] NOT NULL,
	[actualStartDate] [datetime] NOT NULL,
	[actualEndDate] [datetime] NOT NULL,
	[content] [text] NULL,
 CONSTRAINT [PK_Project] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role]    Script Date: 25/11/2021 18:57:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[role] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Role] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tag]    Script Date: 25/11/2021 18:57:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tag](
	[id] [int] NOT NULL,
	[title] [varchar](75) NOT NULL,
	[slug] [varchar](100) NOT NULL,
 CONSTRAINT [PK_Tag] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Task]    Script Date: 25/11/2021 18:57:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Task](
	[id] [int] NOT NULL,
	[userId] [int] NOT NULL,
	[projectId] [int] NOT NULL,
	[createdBy] [int] NOT NULL,
	[updatedBy] [int] NOT NULL,
	[title] [nvarchar](500) NOT NULL,
	[description] [nvarchar](500) NULL,
	[status] [int] NOT NULL,
	[hours] [float] NOT NULL,
	[createdAt] [datetime] NOT NULL,
	[updatedAt] [datetime] NOT NULL,
	[plannedStartDate] [datetime] NOT NULL,
	[plannedEndDate] [datetime] NOT NULL,
	[actualStartDate] [datetime] NULL,
	[actualEndDate] [datetime] NULL,
	[content] [text] NULL,
 CONSTRAINT [PK_Task] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Task_Meta]    Script Date: 25/11/2021 18:57:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Task_Meta](
	[id] [int] NOT NULL,
	[taskId] [int] NOT NULL,
	[key] [varchar](50) NOT NULL,
	[content] [text] NULL,
 CONSTRAINT [PK_Task_Meta] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Task_Tag]    Script Date: 25/11/2021 18:57:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Task_Tag](
	[taskId] [int] NOT NULL,
	[tagId] [int] NOT NULL,
 CONSTRAINT [PK_Task_Tag] PRIMARY KEY CLUSTERED 
(
	[taskId] ASC,
	[tagId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 25/11/2021 18:57:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[roleId] [int] NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[firstName] [varchar](50) NOT NULL,
	[middleName] [varchar](50) NULL,
	[lastName] [varchar](50) NOT NULL,
	[avatar] [text] NULL,
	[email] [nvarchar](255) NOT NULL,
	[mobile] [varchar](15) NULL,
	[registerAt] [datetime] NOT NULL,
	[lastLogin] [datetime] NOT NULL,
	[intro] [text] NULL,
	[profile] [text] NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Role] ON 

INSERT [dbo].[Role] ([id], [role]) VALUES (1, N'Super Admin')
INSERT [dbo].[Role] ([id], [role]) VALUES (3, N'User')
INSERT [dbo].[Role] ([id], [role]) VALUES (4, N'Developer')
SET IDENTITY_INSERT [dbo].[Role] OFF
GO
SET IDENTITY_INSERT [dbo].[User] ON 

INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (1, 1, N'aaa', N'aaa', N'aaa', N'aaa', N'aaa', NULL, N'aaa@gmail.com', N'1234567890', CAST(N'2021-11-25T10:49:49.553' AS DateTime), CAST(N'2021-11-25T10:49:49.553' AS DateTime), NULL, NULL)
INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (2, 1, N'aaaa', N'aaaa', N'aaaa', N'aaaa', N'aaaa', NULL, N'aaaa@gmail.com', N'01234567891', CAST(N'2021-11-25T18:02:58.560' AS DateTime), CAST(N'2021-11-25T18:02:58.560' AS DateTime), NULL, NULL)
INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (3, 3, N'bbb', N'bbb', N'bbb', N'', N'bbb', NULL, N'bbb@gmail.com', N'0123456788', CAST(N'2021-11-25T18:05:11.900' AS DateTime), CAST(N'2021-11-25T18:05:11.900' AS DateTime), NULL, NULL)
SET IDENTITY_INSERT [dbo].[User] OFF
GO
ALTER TABLE [dbo].[Activity]  WITH CHECK ADD  CONSTRAINT [FK_Activity_Task] FOREIGN KEY([taskId])
REFERENCES [dbo].[Task] ([id])
GO
ALTER TABLE [dbo].[Activity] CHECK CONSTRAINT [FK_Activity_Task]
GO
ALTER TABLE [dbo].[Activity]  WITH CHECK ADD  CONSTRAINT [FK_Activity_User] FOREIGN KEY([userId])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Activity] CHECK CONSTRAINT [FK_Activity_User]
GO
ALTER TABLE [dbo].[Activity]  WITH CHECK ADD  CONSTRAINT [FK_Activity_User1] FOREIGN KEY([createdBy])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Activity] CHECK CONSTRAINT [FK_Activity_User1]
GO
ALTER TABLE [dbo].[Activity]  WITH CHECK ADD  CONSTRAINT [FK_Activity_User2] FOREIGN KEY([updatedBy])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Activity] CHECK CONSTRAINT [FK_Activity_User2]
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Activity] FOREIGN KEY([activityId])
REFERENCES [dbo].[Activity] ([id])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Activity]
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Task] FOREIGN KEY([taskId])
REFERENCES [dbo].[Task] ([id])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Task]
GO
ALTER TABLE [dbo].[Project]  WITH CHECK ADD  CONSTRAINT [FK_Project_User] FOREIGN KEY([createdBy])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Project] CHECK CONSTRAINT [FK_Project_User]
GO
ALTER TABLE [dbo].[Project]  WITH CHECK ADD  CONSTRAINT [FK_Project_User1] FOREIGN KEY([updatedBy])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Project] CHECK CONSTRAINT [FK_Project_User1]
GO
ALTER TABLE [dbo].[Task]  WITH CHECK ADD  CONSTRAINT [FK_Task_Project] FOREIGN KEY([projectId])
REFERENCES [dbo].[Project] ([id])
GO
ALTER TABLE [dbo].[Task] CHECK CONSTRAINT [FK_Task_Project]
GO
ALTER TABLE [dbo].[Task]  WITH CHECK ADD  CONSTRAINT [FK_Task_User] FOREIGN KEY([userId])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Task] CHECK CONSTRAINT [FK_Task_User]
GO
ALTER TABLE [dbo].[Task]  WITH CHECK ADD  CONSTRAINT [FK_Task_User1] FOREIGN KEY([createdBy])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Task] CHECK CONSTRAINT [FK_Task_User1]
GO
ALTER TABLE [dbo].[Task]  WITH CHECK ADD  CONSTRAINT [FK_Task_User2] FOREIGN KEY([updatedBy])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Task] CHECK CONSTRAINT [FK_Task_User2]
GO
ALTER TABLE [dbo].[Task_Meta]  WITH CHECK ADD  CONSTRAINT [FK_Task_Meta_Task] FOREIGN KEY([taskId])
REFERENCES [dbo].[Task] ([id])
GO
ALTER TABLE [dbo].[Task_Meta] CHECK CONSTRAINT [FK_Task_Meta_Task]
GO
ALTER TABLE [dbo].[Task_Tag]  WITH CHECK ADD  CONSTRAINT [FK_Task_Tag_Tag] FOREIGN KEY([tagId])
REFERENCES [dbo].[Tag] ([id])
GO
ALTER TABLE [dbo].[Task_Tag] CHECK CONSTRAINT [FK_Task_Tag_Tag]
GO
ALTER TABLE [dbo].[Task_Tag]  WITH CHECK ADD  CONSTRAINT [FK_Task_Tag_Task] FOREIGN KEY([taskId])
REFERENCES [dbo].[Task] ([id])
GO
ALTER TABLE [dbo].[Task_Tag] CHECK CONSTRAINT [FK_Task_Tag_Task]
GO
ALTER TABLE [dbo].[User]  WITH CHECK ADD  CONSTRAINT [FK_User_Role] FOREIGN KEY([roleId])
REFERENCES [dbo].[Role] ([id])
GO
ALTER TABLE [dbo].[User] CHECK CONSTRAINT [FK_User_Role]
GO
USE [master]
GO
ALTER DATABASE [TaskManagement] SET  READ_WRITE 
GO
