package io.github.futurewl.site.entities;

import org.hibernate.search.annotations.Field;

@Entity
@Table(name = "UserPrincipal")
public class User {
    private long id;
    private String username;

    @Id
    @Column(name = "UserId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Field
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
