package com.woraes.resourses;

import com.woraes.Entidades.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* classe para disbonibilizar um recurso web correspondente a unidade
user*/

@RestController //controlador rest que responde no caminho users
@RequestMapping(value = "/users")
public class UserResource {
	
	//testar para ver se esta funcionando
	//criar um metodo que vai ser o end point para acessar os usuarios
//ResponseEntity retorna respostas de requisisoes web <Classe User> nome para o metodo
	
	@GetMapping // metodo que responde a requisisao tipo GET do HTTP
	/*public = tipo
	 *ResponseEntity<User> = tipo especifico do spring pars retornar respostas
	 *buscaTodos =  nome do metodo / que vai retornar o meus usuarios
	 */
	public ResponseEntity<User> buscaTodods(){
		/* User  = instanciar um usuario
		 * teste = nome usuario
		 * new = novo
		 * User a Clase
		 * ()(1L, "maria", "maria@gmail.com", "21999989885", "12345678")
		 * return = retorna
		 * ResponseEntity.ok()
		 * .body(teste) 
		 */
		User teste = new User(1L, "Teste", "teste@gmail.com", "21999989885", "12345678");
		return ResponseEntity.ok().body(teste);
	}
}
