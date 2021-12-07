package io.apicurio.mas.studio.rest.v1;

import io.apicurio.mas.studio.rest.v1.beans.NewTeam;
import io.apicurio.mas.studio.rest.v1.beans.Team;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/apis/studio/v1/teams")
public interface TeamsResource {
  /**
   * Lists all of the teams visible to the authenticated user.
   *
   * This operation may fail for one of the following reasons:
   *
   * * A server error occurred (HTTP error `500`)
   *
   */
  @GET
  @Produces("application/json")
  List<Team> listTeams();

  /**
   * Creates a new team.
   *
   * This operation may fail for one of the following reasons:
   *
   * * The provided team name was invalid (HTTP error `400`)
   * * A team with the provided name already exists (HTTP error `409`)
   * * A server error occurred (HTTP error `500`)
   *
   */
  @POST
  @Consumes("application/json")
  void createTeam(NewTeam data);
}
