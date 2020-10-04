package pmj.bookstore.controller.action;

import pmj.bookstore.controller.Action;
import pmj.bookstore.model.BookBean;
import pmj.bookstore.model.BookBeanUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionInsert  implements Action {

    @Override
    public String perform(HttpServletRequest request,
            HttpServletResponse response) {
    	
    	BookBean book = new BookBean();
    	BookBeanUtils.populateBean(request, book);
        BookBO.addBook( book );
        request.setAttribute("stock", BookBO.getStock());

        return "catalogue_view.jsp";        
    }
    
    
}
