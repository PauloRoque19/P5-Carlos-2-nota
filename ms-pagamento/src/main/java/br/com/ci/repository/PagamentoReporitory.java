/**
 * 
 */
package br.com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ci.model.Pagamento;

/**
 * @author cbgomes
 *
 */
@Repository
public interface PagamentoReporitory extends JpaRepository<Pagamento, Long> {

}
