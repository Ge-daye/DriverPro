# DriverPro
### 背景：

在我们的学习生活中，很多时候需要使用网盘。将文件资料、照片视频等个人数据资产存储到网盘里。然而，“网盘限速”，“网盘容量小”等问题深深的影响到用户，影响使用体验。

而且最近，工信部11.1号在《关于开展信息通信服务感知提升行动的通知》中提到：网盘企业向免费用户提供的上传下载的最低网速应确保满足基本的下载需求。提高用户的体验。

### 解决的问题

解决了传统商业网盘的“速度慢”，“空间容量小”，”不够安全“，分享不便捷等问题。本网盘系统整合了市面上各个网盘的优点，可以应用在普通个人用户的使用场景，也可以作为公司文件资源共享平台使用。

**技术栈：**

前端：vue，node.js, axios,element-UI+webpack

后端：SpringBoot+Springsecurity+Swagger2+redis+mysql+Nginx

### 预期的功能：

#### **用户信息管理模块**。

（1）用户注册可免费获取一个自己的网络硬盘（包括邮件注册和手机号注册），然后进行登录。

（2）可以进行相应的在给定权限内的操作，如修改密码、修改个人资料、安全退出等。

（3）会员充值进行扩容（在线支付）。

#### 文件管理模块。

（1）用户在网盘内可以浏览自己的各种格式的文件，可以预览图片、视频、音乐、PDF等类型的文件。

（2）可以进行文件/文件夹的创建、删除、重命名、移动，可以批量上传、下载文件。

（3）并且支持断点续传以及拖拽上传等高级功能。

#### 文件分享模块。

（1）用户可以批量分享自己的文件并生成一个Url供其他用户访问，支持设置分享的时间。

（2）还支持未登录状态下的文件快速分享。

#### 回收站模块

用户删除文件到回收站后，可以进行文件的恢复与清空。

#### 管理员模块（后台管理）

（1）对所有的用户进行管理。

（2）可以查看所有用户的文件列表。

（3）管理所有已分享的文件。

#### 其他：

（1）所有接口基于Restful风格

（2）应用负载均衡算法。

（3）使用企业级开发前后端分离模式。使用swagger2+Knife4j进行接口的管理

（4）支持高并发的处理请求。
