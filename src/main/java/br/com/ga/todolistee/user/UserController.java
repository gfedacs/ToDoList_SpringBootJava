package br.com.ga.todolistee.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

/*
 * Modificador
 * public
 * private
 * protected
 * 
 */



// Controller é uma camada entre a requisição e as demais camadas
// A Controller recebe as requisições dos usuários
// Primeira camada de acesso


// @Controller -> Retorna varios tipos de dados, templetes, páginas, ...

@RestController // -> Construindo uma API

// Criação de uma ROTA // http://localhost:8080/----



@RequestMapping("/users") // -> Responsável por criar a rota pra acesso ao Users

// http://localhost:8080/users

public class UserController {

    /*
        Método de acesso ao HTTP

     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Eemover um dado
     * PATCH - Alterar somente uma parte da informação ou do nada
     */


    
    // Métodos da classe 
    
    /**
     * String(texto)
     * Integer (int) numeros inteiros
     * Double (double) Numeros 0.0000000
     * Float (float) Numeros 0.000
     * Date (data)
     * char ( A C)
     * void
     */


     @Autowired // -> Gerencia o ciclo de vida.
    private IUserRepository userRepository;


    
    // http://localhost:8080/users/primeiroMetodo
    @PostMapping("/") // -> Método tipo post, pois está criando.

    // RequestBody -> Isso significa que esse objeto vai está dentro do body dda requisição
    // Está recebendo como parâmetro, o objeto q está dentro do body

      public ResponseEntity create(@RequestBody UserModel userModel) {
    var user = this.userRepository.findByUsername(userModel.getUsername());
    
    if (user != null) {
      System.out.println("Usuário Já existe.");
      // Mensagem de erro
      // Status Code
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
    }

    var passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());
    
    userModel.setPassword(passwordHashred);

    var userCreated = this.userRepository.save(userModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
  }
}