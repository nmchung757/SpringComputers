package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Computer;

/**
 * @author Noah Chung - nmchung
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
public interface ComputerRepository extends JpaRepository<Computer, Long> {

}
