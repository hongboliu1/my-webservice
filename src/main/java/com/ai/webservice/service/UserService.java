/**
 * 
 */
package com.ai.webservice.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.ai.webservice.model.User;

/**
 * Class Name		: UserService<br>
 * 
 * Description		: 这里记述class说明<br>
 * 
 * @author liuhb
 * @version $Revision$
 * @see
 *
 */
@WebService(name="UserService")
@SOAPBinding(style = Style.RPC)
public interface UserService {

    public User getUserByName(@WebParam(name = "name") String name);
    
    public void setUser(User user);
}
