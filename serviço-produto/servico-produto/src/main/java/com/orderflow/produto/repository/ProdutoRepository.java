
package com.orderflow.produto.repository;

/**
 *
 * @author rafaellessa
 */
import com.orderflow.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
