package com.analistas.trabajo.Service;


import com.analistas.trabajo.Domain.User;
import com.analistas.trabajo.dtp.ChangePasswordForm;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
	
	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws Exception;
	
	public User changePassword(ChangePasswordForm form) throws Exception;


}
