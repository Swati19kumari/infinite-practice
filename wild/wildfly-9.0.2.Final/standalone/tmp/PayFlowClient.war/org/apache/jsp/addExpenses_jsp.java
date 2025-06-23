package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addExpenses_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fview;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fform;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005foutputLabel_0026_005fvalue_005ffor_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fselectOneMenu_0026_005fvalue_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fselectItems_0026_005fvar_005fvalue_005fitemValue_005fitemLabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005faction_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ff_005fview = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fform = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005foutputLabel_0026_005fvalue_005ffor_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fselectOneMenu_0026_005fvalue_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ff_005fselectItems_0026_005fvar_005fvalue_005fitemValue_005fitemLabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ff_005fview.release();
    _005fjspx_005ftagPool_005fh_005fform.release();
    _005fjspx_005ftagPool_005fh_005foutputLabel_0026_005fvalue_005ffor_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fselectOneMenu_0026_005fvalue_005fid.release();
    _005fjspx_005ftagPool_005ff_005fselectItems_0026_005fvar_005fvalue_005fitemValue_005fitemLabel_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005faction_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      response.addHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Add Expense</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      if (_jspx_meth_f_005fview_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_005fview_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_005fview_005f0 = (com.sun.faces.taglib.jsf_core.ViewTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.jsf_core.ViewTag.class);
    _jspx_th_f_005fview_005f0.setPageContext(_jspx_page_context);
    _jspx_th_f_005fview_005f0.setParent(null);
    _jspx_th_f_005fview_005f0.setJspId("jsp_1380475008_0");
    int _jspx_eval_f_005fview_005f0 = _jspx_th_f_005fview_005f0.doStartTag();
    if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_005fview_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_005fview_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_h_005fform_005f0(_jspx_th_f_005fview_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_f_005fview_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_f_005fview_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fview_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_f_005fview_005f0);
      return true;
    }
    _jspx_th_f_005fview_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_f_005fview_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_005fview_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_005fform_005f0 = (com.sun.faces.taglib.html_basic.FormTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.FormTag.class);
    _jspx_th_h_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_005fview_005f0);
    _jspx_th_h_005fform_005f0.setJspId("jsp_1380475008_1");
    int _jspx_eval_h_005fform_005f0 = _jspx_th_h_005fform_005f0.doStartTag();
    if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fform_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("            <h2>Add New Expense</h2>\n");
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_005foutputLabel_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_005finputText_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br/><br/>\n");
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_005foutputLabel_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_005finputText_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br/><br/>\n");
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_005foutputLabel_005f2(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_005fselectOneMenu_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br/><br/>\n");
        out.write("\n");
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_005foutputLabel_005f3(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_005fselectOneMenu_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br/><br/>\n");
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_005fcommandButton_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_h_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fform_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005fform_005f0);
      return true;
    }
    _jspx_th_h_005fform_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f0 = (com.sun.faces.taglib.html_basic.OutputLabelTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.OutputLabelTag.class);
    _jspx_th_h_005foutputLabel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputLabel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /addExpenses.jsp(14,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputLabel_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(14,12) 'Amount: '",_el_expressionfactory.createValueExpression("Amount: ",java.lang.Object.class)));
    // /addExpenses.jsp(14,12) name = for type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005foutputLabel_005f0.setFor(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(14,12) 'amount'",_el_expressionfactory.createValueExpression("amount",java.lang.String.class)));
    _jspx_th_h_005foutputLabel_005f0.setJspId("jsp_1380475008_2");
    int _jspx_eval_h_005foutputLabel_005f0 = _jspx_th_h_005foutputLabel_005f0.doStartTag();
    if (_jspx_th_h_005foutputLabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputLabel_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005foutputLabel_005f0);
      return true;
    }
    _jspx_th_h_005foutputLabel_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005foutputLabel_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f0 = (com.sun.faces.taglib.html_basic.InputTextTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.InputTextTag.class);
    _jspx_th_h_005finputText_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputText_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /addExpenses.jsp(15,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputText_005f0.setId("amount");
    // /addExpenses.jsp(15,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputText_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(15,12) '#{expenseController.expense.totalAmount}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{expenseController.expense.totalAmount}",java.lang.Object.class)));
    _jspx_th_h_005finputText_005f0.setJspId("jsp_1380475008_3");
    int _jspx_eval_h_005finputText_005f0 = _jspx_th_h_005finputText_005f0.doStartTag();
    if (_jspx_th_h_005finputText_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputText_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f0);
      return true;
    }
    _jspx_th_h_005finputText_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f1 = (com.sun.faces.taglib.html_basic.OutputLabelTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.OutputLabelTag.class);
    _jspx_th_h_005foutputLabel_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputLabel_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /addExpenses.jsp(17,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputLabel_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(17,12) 'Description: '",_el_expressionfactory.createValueExpression("Description: ",java.lang.Object.class)));
    // /addExpenses.jsp(17,12) name = for type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005foutputLabel_005f1.setFor(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(17,12) 'desc'",_el_expressionfactory.createValueExpression("desc",java.lang.String.class)));
    _jspx_th_h_005foutputLabel_005f1.setJspId("jsp_1380475008_4");
    int _jspx_eval_h_005foutputLabel_005f1 = _jspx_th_h_005foutputLabel_005f1.doStartTag();
    if (_jspx_th_h_005foutputLabel_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputLabel_005f1.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005foutputLabel_005f1);
      return true;
    }
    _jspx_th_h_005foutputLabel_005f1.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005foutputLabel_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f1 = (com.sun.faces.taglib.html_basic.InputTextTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.InputTextTag.class);
    _jspx_th_h_005finputText_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputText_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /addExpenses.jsp(18,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputText_005f1.setId("desc");
    // /addExpenses.jsp(18,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputText_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(18,12) '#{expenseController.expense.description}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{expenseController.expense.description}",java.lang.Object.class)));
    _jspx_th_h_005finputText_005f1.setJspId("jsp_1380475008_5");
    int _jspx_eval_h_005finputText_005f1 = _jspx_th_h_005finputText_005f1.doStartTag();
    if (_jspx_th_h_005finputText_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputText_005f1.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f1);
      return true;
    }
    _jspx_th_h_005finputText_005f1.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f2 = (com.sun.faces.taglib.html_basic.OutputLabelTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.OutputLabelTag.class);
    _jspx_th_h_005foutputLabel_005f2.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputLabel_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /addExpenses.jsp(20,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputLabel_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(20,12) 'Select Group:'",_el_expressionfactory.createValueExpression("Select Group:",java.lang.Object.class)));
    // /addExpenses.jsp(20,12) name = for type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005foutputLabel_005f2.setFor(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(20,12) 'group'",_el_expressionfactory.createValueExpression("group",java.lang.String.class)));
    _jspx_th_h_005foutputLabel_005f2.setJspId("jsp_1380475008_6");
    int _jspx_eval_h_005foutputLabel_005f2 = _jspx_th_h_005foutputLabel_005f2.doStartTag();
    if (_jspx_th_h_005foutputLabel_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputLabel_005f2.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005foutputLabel_005f2);
      return true;
    }
    _jspx_th_h_005foutputLabel_005f2.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005foutputLabel_005f2);
    return false;
  }

  private boolean _jspx_meth_h_005fselectOneMenu_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:selectOneMenu
    com.sun.faces.taglib.html_basic.SelectOneMenuTag _jspx_th_h_005fselectOneMenu_005f0 = (com.sun.faces.taglib.html_basic.SelectOneMenuTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.SelectOneMenuTag.class);
    _jspx_th_h_005fselectOneMenu_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fselectOneMenu_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /addExpenses.jsp(21,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fselectOneMenu_005f0.setId("group");
    // /addExpenses.jsp(21,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005fselectOneMenu_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(21,12) '#{expenseController.groupId}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{expenseController.groupId}",java.lang.Object.class)));
    _jspx_th_h_005fselectOneMenu_005f0.setJspId("jsp_1380475008_7");
    int _jspx_eval_h_005fselectOneMenu_005f0 = _jspx_th_h_005fselectOneMenu_005f0.doStartTag();
    if (_jspx_eval_h_005fselectOneMenu_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fselectOneMenu_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fselectOneMenu_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fselectOneMenu_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_f_005fselectItems_005f0(_jspx_th_h_005fselectOneMenu_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_005fselectOneMenu_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fselectOneMenu_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fselectOneMenu_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fselectOneMenu_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005fselectOneMenu_005f0);
      return true;
    }
    _jspx_th_h_005fselectOneMenu_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005fselectOneMenu_005f0);
    return false;
  }

  private boolean _jspx_meth_f_005fselectItems_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fselectOneMenu_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItems
    com.sun.faces.taglib.jsf_core.SelectItemsTag _jspx_th_f_005fselectItems_005f0 = (com.sun.faces.taglib.jsf_core.SelectItemsTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.jsf_core.SelectItemsTag.class);
    _jspx_th_f_005fselectItems_005f0.setPageContext(_jspx_page_context);
    _jspx_th_f_005fselectItems_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fselectOneMenu_005f0);
    // /addExpenses.jsp(22,16) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_f_005fselectItems_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(22,16) '#{expenseController.allGroups}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{expenseController.allGroups}",java.lang.Object.class)));
    // /addExpenses.jsp(22,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_f_005fselectItems_005f0.setVar("g");
    // /addExpenses.jsp(22,16) name = itemValue type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_f_005fselectItems_005f0.setItemValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(22,16) '#{g.id}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{g.id}",java.lang.Object.class)));
    // /addExpenses.jsp(22,16) name = itemLabel type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_f_005fselectItems_005f0.setItemLabel(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(22,16) '#{g.name}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{g.name}",java.lang.String.class)));
    _jspx_th_f_005fselectItems_005f0.setJspId("jsp_1380475008_8");
    int _jspx_eval_f_005fselectItems_005f0 = _jspx_th_f_005fselectItems_005f0.doStartTag();
    if (_jspx_th_f_005fselectItems_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fselectItems_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_f_005fselectItems_005f0);
      return true;
    }
    _jspx_th_f_005fselectItems_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_f_005fselectItems_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f3 = (com.sun.faces.taglib.html_basic.OutputLabelTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.OutputLabelTag.class);
    _jspx_th_h_005foutputLabel_005f3.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputLabel_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /addExpenses.jsp(27,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputLabel_005f3.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(27,12) 'Paid By:'",_el_expressionfactory.createValueExpression("Paid By:",java.lang.Object.class)));
    // /addExpenses.jsp(27,12) name = for type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005foutputLabel_005f3.setFor(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(27,12) 'user'",_el_expressionfactory.createValueExpression("user",java.lang.String.class)));
    _jspx_th_h_005foutputLabel_005f3.setJspId("jsp_1380475008_9");
    int _jspx_eval_h_005foutputLabel_005f3 = _jspx_th_h_005foutputLabel_005f3.doStartTag();
    if (_jspx_th_h_005foutputLabel_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputLabel_005f3.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005foutputLabel_005f3);
      return true;
    }
    _jspx_th_h_005foutputLabel_005f3.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005foutputLabel_005f3);
    return false;
  }

  private boolean _jspx_meth_h_005fselectOneMenu_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:selectOneMenu
    com.sun.faces.taglib.html_basic.SelectOneMenuTag _jspx_th_h_005fselectOneMenu_005f1 = (com.sun.faces.taglib.html_basic.SelectOneMenuTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.SelectOneMenuTag.class);
    _jspx_th_h_005fselectOneMenu_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005fselectOneMenu_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /addExpenses.jsp(28,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fselectOneMenu_005f1.setId("user");
    // /addExpenses.jsp(28,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005fselectOneMenu_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(28,12) '#{expenseController.userId}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{expenseController.userId}",java.lang.Object.class)));
    _jspx_th_h_005fselectOneMenu_005f1.setJspId("jsp_1380475008_10");
    int _jspx_eval_h_005fselectOneMenu_005f1 = _jspx_th_h_005fselectOneMenu_005f1.doStartTag();
    if (_jspx_eval_h_005fselectOneMenu_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fselectOneMenu_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fselectOneMenu_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fselectOneMenu_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_f_005fselectItems_005f1(_jspx_th_h_005fselectOneMenu_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_005fselectOneMenu_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fselectOneMenu_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fselectOneMenu_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fselectOneMenu_005f1.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005fselectOneMenu_005f1);
      return true;
    }
    _jspx_th_h_005fselectOneMenu_005f1.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005fselectOneMenu_005f1);
    return false;
  }

  private boolean _jspx_meth_f_005fselectItems_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fselectOneMenu_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItems
    com.sun.faces.taglib.jsf_core.SelectItemsTag _jspx_th_f_005fselectItems_005f1 = (com.sun.faces.taglib.jsf_core.SelectItemsTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.jsf_core.SelectItemsTag.class);
    _jspx_th_f_005fselectItems_005f1.setPageContext(_jspx_page_context);
    _jspx_th_f_005fselectItems_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fselectOneMenu_005f1);
    // /addExpenses.jsp(29,16) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_f_005fselectItems_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(29,16) '#{expenseController.allUsers}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{expenseController.allUsers}",java.lang.Object.class)));
    // /addExpenses.jsp(29,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_f_005fselectItems_005f1.setVar("u");
    // /addExpenses.jsp(29,16) name = itemValue type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_f_005fselectItems_005f1.setItemValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(29,16) '#{u.id}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{u.id}",java.lang.Object.class)));
    // /addExpenses.jsp(29,16) name = itemLabel type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_f_005fselectItems_005f1.setItemLabel(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(29,16) '#{u.name}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{u.name}",java.lang.String.class)));
    _jspx_th_f_005fselectItems_005f1.setJspId("jsp_1380475008_11");
    int _jspx_eval_f_005fselectItems_005f1 = _jspx_th_f_005fselectItems_005f1.doStartTag();
    if (_jspx_th_f_005fselectItems_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fselectItems_005f1.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_f_005fselectItems_005f1);
      return true;
    }
    _jspx_th_f_005fselectItems_005f1.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_f_005fselectItems_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005fcommandButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_005fcommandButton_005f0 = (com.sun.faces.taglib.html_basic.CommandButtonTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class);
    _jspx_th_h_005fcommandButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fcommandButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /addExpenses.jsp(33,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005fcommandButton_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/addExpenses.jsp(33,12) 'Add Expense'",_el_expressionfactory.createValueExpression("Add Expense",java.lang.Object.class)));
    // /addExpenses.jsp(33,12) name = action type = javax.el.MethodExpression reqTime = false required = false fragment = false deferredValue = false deferredMethod = true expectedTypeName = null methodSignature = java.lang.Object action() 
    _jspx_th_h_005fcommandButton_005f0.setAction(new org.apache.jasper.el.JspMethodExpression("/addExpenses.jsp(33,12) '#{expenseController.addExpense}'",_el_expressionfactory.createMethodExpression(_jspx_page_context.getELContext(),"#{expenseController.addExpense}",java.lang.Object.class,new Class[] {})));
    _jspx_th_h_005fcommandButton_005f0.setJspId("jsp_1380475008_12");
    int _jspx_eval_h_005fcommandButton_005f0 = _jspx_th_h_005fcommandButton_005f0.doStartTag();
    if (_jspx_th_h_005fcommandButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fcommandButton_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005fcommandButton_005f0);
      return true;
    }
    _jspx_th_h_005fcommandButton_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005fcommandButton_005f0);
    return false;
  }
}
