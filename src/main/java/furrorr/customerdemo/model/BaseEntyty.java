package furrorr.customerdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntyty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
