package io.apicurio.mas.studio.rest.v1;

import io.apicurio.mas.studio.rest.v1.beans.UserInfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/apis/studio/v1/users")
public interface UsersResource {
  /**
   * Returns information about the currently authenticated user.
   */
  @Path("/me")
  @GET
  @Produces("application/json")
  UserInfo getCurrentUserInfo();
}
