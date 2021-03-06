
package io.apicurio.mas.studio.rest.v1.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for SearchResults
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "members",
    "count"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
@lombok.Builder
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.EqualsAndHashCode
@lombok.ToString
public class TeamMemberResults {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("members")
    @JsonPropertyDescription("")
    private List<TeamMember> members = new ArrayList<TeamMember>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    private Integer count;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("members")
    public List<TeamMember> getMembers() {
        return members;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("members")
    public void setMembers(List<TeamMember> members) {
        this.members = members;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

}
