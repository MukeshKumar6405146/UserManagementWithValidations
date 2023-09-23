package Mukesh.Lomror.UserManagementWithValidations.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotNull
    private Integer id;
    @NotBlank
    private String name;
    @DateTimeFormat(pattern = "dd MM yyyy")
    private LocalDate dob;
    @Email
    @NotBlank
    private String email;
    @Pattern(regexp = "[0-9]{10}", message = "Invalid phone number")
    private String phoneNo;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate date;
    private LocalTime time;
}
