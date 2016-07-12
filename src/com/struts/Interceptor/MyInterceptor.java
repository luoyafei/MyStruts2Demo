package com.struts.Interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		
		/*HttpServletRequest request = ServletActionContext.getRequest();
System.out.println(request.getParameter("userName"));*/
//System.out.println(request.getParameter("password"));
/*		ActionContext ac = arg0.getInvocationContext();
		Map ps = ac.getParameters();
System.out.println(ps.get("userName").toString());*/
		/*User u = (User)session.get("user");
		if(u == null)
			return Action.INPUT;
		System.out.println("There is MyInterceptor! User:" + u.getUserId() + "," + u.getUserName() + "," + u.getPassword());*/
System.out.println("这里是MyInterceptor类！");
		return arg0.invoke();
	}

}
