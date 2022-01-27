package microservice.email.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data // Lombok Para nao precisar colocar os gets/sets
public class EmailDto {

	@NotBlank
	private String ownerRef;
	@NotBlank
	@Email // verifica se o e-mail eh valido
	private String emailFrom;
	@NotBlank
	@Email
	private String emailTo;
	@NotBlank
	private String subject;
	@NotBlank
	private String text;

}
