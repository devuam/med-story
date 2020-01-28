package mx.christez.medstory.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import mx.christez.medstory.entity.AppUser;
import mx.christez.medstory.entity.Role;
import mx.christez.medstory.repository.AppUserRepository;
import mx.christez.medstory.repository.RoleRepository;

@Transactional
@Service
public class InitializeAppService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private AppUserRepository appUserRepository;
	
	@PostConstruct
	public void init() {
		if(roleRepository.findByName("ROLE_ADMIN") == null) {
			Role roleUser = new Role();
			roleUser.setName("ROLE_USER");
			roleRepository.save(roleUser);
			
			Role roleAdmin = new Role();
			roleAdmin.setName("ROLE_ADMIN");
			roleRepository.save(roleAdmin);
			
			AppUser userAdmin = new AppUser();
			userAdmin.setEmail("admin@admin.com");
			userAdmin.setEnabled(true);
			userAdmin.setName("Admin Admin");
			
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();		
			userAdmin.setPassword(encoder.encode("admin"));
			
			List<Role> roles = new ArrayList<Role>();
			roles.add(roleAdmin);
			userAdmin.setRoles(roles);
			appUserRepository.save(userAdmin);
			
			/*********************************************************************************************************************************************************
			 Create user ********************************************************************************************************************************************* 
			 *********************************************************************************************************************************************************/
			
			AppUser christezUser = new AppUser();
			christezUser.setEmail("christofer.estebanez@nytek.com.mx");
			christezUser.setEnabled(true);
			christezUser.setName("Christofer Estebanez");
			
			christezUser.setPassword(encoder.encode("123"));
			
			List<Role> christezRoles = new ArrayList<Role>();
			christezRoles.add(roleUser);
			christezUser.setRoles(christezRoles);
			appUserRepository.save(christezUser);
		}
	}
}