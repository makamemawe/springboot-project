package Project.Spring.Project.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity

public class Users {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String userAddress;
    private Integer phone;
}
