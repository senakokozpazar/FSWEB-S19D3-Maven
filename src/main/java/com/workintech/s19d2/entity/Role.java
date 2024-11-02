package com.workintech.s19d2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Data
@NoArgsConstructor
@Entity
@Table(name="role", schema="bank")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="authority")
    private String authority; //GrantedAuthority ile gelen getAuthority metotunu bu variable ile yakalıyoruz, Custom bir rol tablosu oluşturup spring security nin rol tablosu gibi davranmasını sağlıyoruz.

}
