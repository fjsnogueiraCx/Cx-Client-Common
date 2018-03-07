package cx.restclient.sast.dto;

import java.util.List;

/**
 * Created by Galn on 14/02/2018.
 */
public class Query {
    private long id;
    private String name;
    private String ownerName;
    private Link link;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}
