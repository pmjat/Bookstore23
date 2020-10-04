package pmj.bookstore.controller.action;

import pmj.bookstore.controller.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionRemove implements Action {

    @Override
    public String perform(HttpServletRequest request,
            HttpServletResponse response) {

            BookBO.removeBook( request.getParameter("isbn") );
            request.setAttribute("stock", BookBO.getStock());            

            return "catalogue_view.jsp";        
    }
}
