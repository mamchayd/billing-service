package ma.enset.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.model.Customer;
import ma.enset.model.Prodect;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class ProductItem {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    private Prodect product;
    private Long productId;
    private double price;
    private double quantity;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Bill bill;
	
}
