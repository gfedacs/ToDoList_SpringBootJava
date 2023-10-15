package br.com.ga.todolistee.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

//Responsável por fazer a mediação com o banco de dados.

public interface IUserRepository extends JpaRepository<UserModel, UUID> {
  UserModel findByUsername(String username);
}