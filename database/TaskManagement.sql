USE [master]
GO
/****** Object:  Database [TaskManagement]    Script Date: 28/11/2021 11:25:19 ******/
CREATE DATABASE [TaskManagement]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'TaskManagement', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\TaskManagement.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'TaskManagement_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\TaskManagement_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
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
EXEC sys.sp_db_vardecimal_storage_format N'TaskManagement', N'ON'
GO
USE [TaskManagement]
GO
/****** Object:  Table [dbo].[Action]    Script Date: 28/11/2021 11:25:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Action](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[actionName] [varchar](500) NOT NULL,
	[groupId] [int] NOT NULL,
	[actionCode] [varchar](500) NULL,
 CONSTRAINT [PK_Action] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Activity]    Script Date: 28/11/2021 11:25:20 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Comment]    Script Date: 28/11/2021 11:25:20 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Group_Action]    Script Date: 28/11/2021 11:25:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Group_Action](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[groupName] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Group_Action] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Project]    Script Date: 28/11/2021 11:25:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Project](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [varchar](500) NOT NULL,
	[description] [text] NULL,
	[teamId] [int] NOT NULL,
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role]    Script Date: 28/11/2021 11:25:20 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role_Action]    Script Date: 28/11/2021 11:25:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role_Action](
	[roleId] [int] NOT NULL,
	[actionId] [int] NOT NULL,
 CONSTRAINT [PK_Role_Action] PRIMARY KEY CLUSTERED 
(
	[roleId] ASC,
	[actionId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tag]    Script Date: 28/11/2021 11:25:20 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Task]    Script Date: 28/11/2021 11:25:20 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Task_Meta]    Script Date: 28/11/2021 11:25:20 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Task_Tag]    Script Date: 28/11/2021 11:25:20 ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Team]    Script Date: 28/11/2021 11:25:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Team](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](500) NOT NULL,
	[leaderId] [int] NOT NULL,
	[description] [text] NULL,
 CONSTRAINT [PK_Team] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Team_User]    Script Date: 28/11/2021 11:25:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Team_User](
	[teamId] [int] NOT NULL,
	[userId] [int] NOT NULL,
	[description] [text] NULL,
 CONSTRAINT [PK_Team_User] PRIMARY KEY CLUSTERED 
(
	[teamId] ASC,
	[userId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 28/11/2021 11:25:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[roleId] [int] NOT NULL,
	[username] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[firstName] [nvarchar](50) NOT NULL,
	[middleName] [nvarchar](50) NULL,
	[lastName] [nvarchar](50) NOT NULL,
	[avatar] [text] NULL,
	[email] [varchar](255) NOT NULL,
	[mobile] [varchar](15) NULL,
	[registerAt] [datetime] NOT NULL,
	[lastLogin] [datetime] NOT NULL,
	[intro] [text] NULL,
	[profile] [text] NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Action] ON 

INSERT [dbo].[Action] ([id], [actionName], [groupId], [actionCode]) VALUES (11, N'Manage', 2, NULL)
INSERT [dbo].[Action] ([id], [actionName], [groupId], [actionCode]) VALUES (12, N'Manage', 1, NULL)
INSERT [dbo].[Action] ([id], [actionName], [groupId], [actionCode]) VALUES (13, N'Create', 1, NULL)
INSERT [dbo].[Action] ([id], [actionName], [groupId], [actionCode]) VALUES (14, N'Create', 3, NULL)
INSERT [dbo].[Action] ([id], [actionName], [groupId], [actionCode]) VALUES (15, N'Assign Developer', 2, NULL)
INSERT [dbo].[Action] ([id], [actionName], [groupId], [actionCode]) VALUES (16, N'Manage', 3, NULL)
INSERT [dbo].[Action] ([id], [actionName], [groupId], [actionCode]) VALUES (17, N'Manage', 4, NULL)
INSERT [dbo].[Action] ([id], [actionName], [groupId], [actionCode]) VALUES (18, N'View', 3, NULL)
INSERT [dbo].[Action] ([id], [actionName], [groupId], [actionCode]) VALUES (19, N'Add', 5, NULL)
INSERT [dbo].[Action] ([id], [actionName], [groupId], [actionCode]) VALUES (20, N'Change Status', 4, NULL)
SET IDENTITY_INSERT [dbo].[Action] OFF
GO
SET IDENTITY_INSERT [dbo].[Group_Action] ON 

INSERT [dbo].[Group_Action] ([id], [groupName]) VALUES (1, N'Project')
INSERT [dbo].[Group_Action] ([id], [groupName]) VALUES (2, N'User')
INSERT [dbo].[Group_Action] ([id], [groupName]) VALUES (3, N'Task')
INSERT [dbo].[Group_Action] ([id], [groupName]) VALUES (4, N'Bug')
INSERT [dbo].[Group_Action] ([id], [groupName]) VALUES (5, N'Comment')
SET IDENTITY_INSERT [dbo].[Group_Action] OFF
GO
SET IDENTITY_INSERT [dbo].[Project] ON 

INSERT [dbo].[Project] ([id], [title], [description], [teamId], [createdBy], [updatedBy], [status], [hours], [createdAt], [updatedAt], [plannedStartDate], [plannedEndDate], [actualStartDate], [actualEndDate], [content]) VALUES (1, N'Task Management', NULL, 1, 2, 2, 0, 0, CAST(N'2021-11-28T10:55:00.000' AS DateTime), CAST(N'2021-11-28T10:55:00.000' AS DateTime), CAST(N'2021-12-01T00:00:00.000' AS DateTime), CAST(N'2021-12-10T00:00:00.000' AS DateTime), CAST(N'2021-12-01T00:00:00.000' AS DateTime), CAST(N'2021-12-10T00:00:00.000' AS DateTime), NULL)
INSERT [dbo].[Project] ([id], [title], [description], [teamId], [createdBy], [updatedBy], [status], [hours], [createdAt], [updatedAt], [plannedStartDate], [plannedEndDate], [actualStartDate], [actualEndDate], [content]) VALUES (2, N'Aroma Trading', NULL, 2, 3, 3, 0, 0, CAST(N'2021-11-28T00:00:00.000' AS DateTime), CAST(N'2021-11-28T00:00:00.000' AS DateTime), CAST(N'2021-12-01T00:00:00.000' AS DateTime), CAST(N'2021-12-20T00:00:00.000' AS DateTime), CAST(N'2021-12-01T00:00:00.000' AS DateTime), CAST(N'2021-12-20T00:00:00.000' AS DateTime), NULL)
SET IDENTITY_INSERT [dbo].[Project] OFF
GO
SET IDENTITY_INSERT [dbo].[Role] ON 

INSERT [dbo].[Role] ([id], [role]) VALUES (1, N'Super Admin')
INSERT [dbo].[Role] ([id], [role]) VALUES (3, N'User')
INSERT [dbo].[Role] ([id], [role]) VALUES (4, N'Developer')
SET IDENTITY_INSERT [dbo].[Role] OFF
GO
SET IDENTITY_INSERT [dbo].[Team] ON 

INSERT [dbo].[Team] ([id], [name], [leaderId], [description]) VALUES (1, N'IT', 2, NULL)
INSERT [dbo].[Team] ([id], [name], [leaderId], [description]) VALUES (2, N'Marketing', 3, NULL)
INSERT [dbo].[Team] ([id], [name], [leaderId], [description]) VALUES (3, N'AI', 6, N'demo1')
INSERT [dbo].[Team] ([id], [name], [leaderId], [description]) VALUES (4, N'IA', 14, N'demo')
INSERT [dbo].[Team] ([id], [name], [leaderId], [description]) VALUES (6, N'Tien Tien', 12, N'de')
SET IDENTITY_INSERT [dbo].[Team] OFF
GO
INSERT [dbo].[Team_User] ([teamId], [userId], [description]) VALUES (1, 3, NULL)
INSERT [dbo].[Team_User] ([teamId], [userId], [description]) VALUES (1, 6, NULL)
INSERT [dbo].[Team_User] ([teamId], [userId], [description]) VALUES (1, 10, NULL)
INSERT [dbo].[Team_User] ([teamId], [userId], [description]) VALUES (1, 14, NULL)
INSERT [dbo].[Team_User] ([teamId], [userId], [description]) VALUES (2, 2, NULL)
INSERT [dbo].[Team_User] ([teamId], [userId], [description]) VALUES (2, 3, NULL)
INSERT [dbo].[Team_User] ([teamId], [userId], [description]) VALUES (2, 12, NULL)
INSERT [dbo].[Team_User] ([teamId], [userId], [description]) VALUES (2, 14, NULL)
INSERT [dbo].[Team_User] ([teamId], [userId], [description]) VALUES (3, 10, NULL)
INSERT [dbo].[Team_User] ([teamId], [userId], [description]) VALUES (4, 14, NULL)
GO
SET IDENTITY_INSERT [dbo].[User] ON 

INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (1, 1, N'aaa', N'aaa', N'aaa', N'aaa', N'aaa', NULL, N'aaa@gmail.com', N'1234567890', CAST(N'2021-11-25T10:49:49.553' AS DateTime), CAST(N'2021-11-25T22:28:32.023' AS DateTime), NULL, NULL)
INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (2, 3, N'aaaa', N'aaaa', N'aaaa', N'aaaa', N'aaaa', NULL, N'aaaa@gmail.com', N'01234567891', CAST(N'2021-11-25T18:02:58.560' AS DateTime), CAST(N'2021-11-25T18:02:58.560' AS DateTime), NULL, NULL)
INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (3, 3, N'bbb', N'bbb', N'bbb', N'', N'bbb', NULL, N'bbb@gmail.com', N'0123456788', CAST(N'2021-11-25T18:05:11.900' AS DateTime), CAST(N'2021-11-25T18:05:11.900' AS DateTime), NULL, NULL)
INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (6, 3, N'datbthe141351', N'datbthe141351', N'Đạt', N'Tiến', N'Bùi', NULL, N'datbthe141351@fpt.edu.vn', N'1212121212', CAST(N'2021-11-20T00:00:00.000' AS DateTime), CAST(N'2021-11-20T00:00:00.000' AS DateTime), NULL, NULL)
INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (10, 3, N'dunglnqhe150181', N'dunglnqhe150181', N'Dũng', N'Nguyễn Quang', N'Lê', NULL, N'dunglnqhe150181@fpt.edu.vn', N'1234567891', CAST(N'2020-02-01T00:00:00.000' AS DateTime), CAST(N'2020-02-01T00:00:00.000' AS DateTime), NULL, NULL)
INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (11, 3, N'anhlthe150222', N'anhlthe150222', N'Anh', N'Tiến', N'Lương', NULL, N'anhlthe150222@fpt.edu.vn', N'1238617283', CAST(N'2021-03-02T00:00:00.000' AS DateTime), CAST(N'2012-12-02T00:00:00.000' AS DateTime), NULL, NULL)
INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (12, 3, N'sonnche150279', N'sonnche150279', N'Sơn', N'Cao', N'Nguyễn', NULL, N'sonnche150279@fpt.edu.vn', N'3123145332', CAST(N'2002-01-02T00:00:00.000' AS DateTime), CAST(N'2002-01-02T00:00:00.000' AS DateTime), NULL, NULL)
INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (14, 3, N'quyhphe150430', N'quyhphe150430', N'Quý', N'Phú', N'Hà', NULL, N'quyhphe150430@fpt.edu.vn', N'3212131231', CAST(N'2001-02-03T00:00:00.000' AS DateTime), CAST(N'2001-03-12T00:00:00.000' AS DateTime), NULL, NULL)
INSERT [dbo].[User] ([id], [roleId], [username], [password], [firstName], [middleName], [lastName], [avatar], [email], [mobile], [registerAt], [lastLogin], [intro], [profile]) VALUES (15, 4, N'datnhhe150442', N'datnhhe150442', N'Đạt', N'Hoàng', N'Nghiêm', NULL, N'datnhhe150442@fpt.edu.vn', N'3134132131', CAST(N'2021-12-03T00:00:00.000' AS DateTime), CAST(N'2003-12-03T00:00:00.000' AS DateTime), NULL, NULL)
SET IDENTITY_INSERT [dbo].[User] OFF
GO
ALTER TABLE [dbo].[Action]  WITH CHECK ADD  CONSTRAINT [FK_Action_Group_Action] FOREIGN KEY([groupId])
REFERENCES [dbo].[Group_Action] ([id])
GO
ALTER TABLE [dbo].[Action] CHECK CONSTRAINT [FK_Action_Group_Action]
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
ALTER TABLE [dbo].[Project]  WITH CHECK ADD  CONSTRAINT [FK_Project_Team] FOREIGN KEY([teamId])
REFERENCES [dbo].[Team] ([id])
GO
ALTER TABLE [dbo].[Project] CHECK CONSTRAINT [FK_Project_Team]
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
ALTER TABLE [dbo].[Role_Action]  WITH CHECK ADD  CONSTRAINT [FK_Role_Action_Action] FOREIGN KEY([actionId])
REFERENCES [dbo].[Action] ([id])
GO
ALTER TABLE [dbo].[Role_Action] CHECK CONSTRAINT [FK_Role_Action_Action]
GO
ALTER TABLE [dbo].[Role_Action]  WITH CHECK ADD  CONSTRAINT [FK_Role_Action_Role] FOREIGN KEY([roleId])
REFERENCES [dbo].[Role] ([id])
GO
ALTER TABLE [dbo].[Role_Action] CHECK CONSTRAINT [FK_Role_Action_Role]
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
ALTER TABLE [dbo].[Team]  WITH CHECK ADD  CONSTRAINT [FK_Team_User] FOREIGN KEY([leaderId])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Team] CHECK CONSTRAINT [FK_Team_User]
GO
ALTER TABLE [dbo].[Team_User]  WITH CHECK ADD  CONSTRAINT [FK_Team_User_Team] FOREIGN KEY([teamId])
REFERENCES [dbo].[Team] ([id])
GO
ALTER TABLE [dbo].[Team_User] CHECK CONSTRAINT [FK_Team_User_Team]
GO
ALTER TABLE [dbo].[Team_User]  WITH CHECK ADD  CONSTRAINT [FK_Team_User_User] FOREIGN KEY([userId])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Team_User] CHECK CONSTRAINT [FK_Team_User_User]
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
