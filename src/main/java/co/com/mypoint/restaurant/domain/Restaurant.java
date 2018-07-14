package co.com.mypoint.restaurant.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    private String id;
    private String name;
    private String status;
}
