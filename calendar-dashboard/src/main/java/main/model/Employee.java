package main.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.enums.PostCategorie;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	private User user;

	private String name;

	private String post;

	private boolean isBeneficiary;

	private PostCategorie postCategorie;

	@ManyToOne
	private Department department;

	private int vacationDays;

	@OneToMany
	private List<Vacation> vacations;
}
