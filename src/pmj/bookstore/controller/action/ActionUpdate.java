package pmj.bookstore.controller.action;

import pmj.bookstore.controller.Action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pmj.bookstore.model.BookBean;
import pmj.bookstore.model.BookBeanUtils;

public class ActionUpdate implements Action {

    @Override
    public String perform(HttpServletRequest request,
            HttpServletResponse response) {
    	
    	BookBean book = new BookBean();
    	BookBeanUtils.populateBean(request, book);
    	BookBO.saveBook( book );
        request.setAttribute("stock", BookBO.getStock());
        
        return "catalogue_view.jsp";        
    }
}
