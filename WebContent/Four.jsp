<%-- 1.指令
<%@page %> 对Jsp解释器进行操作 例如禁用session、页面编码、 忽略el表达式、 缓存大小、执行过程出现错误跳转页面
<%@include %> 包含页面
<%@taglib %> 引入标签库
                参考：http://www.runoob.com/jsp/jsp-directives.html
2.声明
  <!%  %>  在servlet类中声明变量和方法 ，声明不会在输出流中输出   
3.脚本
  <!%  %>  复制到_jspService()方法中的代码,方法体内,处理期间执行,可以输出
4.表达式
  <%= %>   也是复制到_jspService()方法中的代码,可以调用方法或者进行简单运算 
<!--可以在tomcat的work文件夹-项目名-查看编译后的jsp文件  -->
--%>
<!-- 5.JSP标签
 5.1 include的不同
动态包含  包含的文件单独编译,访问后再访问包含的页面
<jsp:include page="index.jsp"></jsp:include>
 -->

<!-- 静态包含 在jsp编译器转换java前将文件合并编译 只发生一次-->
<%-- <%@ include file="index.jsp"  %> --%>

<!-- 指令方式速度快 只计算一次,由于合并编译java文件会变大,java编译后字节数最大不超过65534
JSP:include被包含不能使用包含页面的定义的变量 -->


<!-- 转发页面
<jsp:forward page="index.jsp">
</jsp:forward> -->

<!-- 6.JSP隐式变量  对应着servlet 
request	    	HttpServletRequest类的实例

	 <%= application.getInitParameter("database")  %>
	 
response		HttpServletResponse类的实例
out				PrintWriter类的实例，用于把结果输出至网页上
session			HttpSession类的实例
application		ServletContext类的实例，与应用上下文有关
    database： <%= application.getInitParameter("database")  %>
 
config			ServletConfig类的实例
pageContext		PageContext类的实例，提供对JSP页面所有对象以及命名空间的访问
page			类似于Java类中的this关键字
Exception		Exception类的对象，代表发生错误的JSP页面中对应的异常对象
 -->
 
 
 
 
 
 
 
 
 
 
 
 
 
 