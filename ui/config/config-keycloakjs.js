var ApicurioRegistryConfig = {
    artifacts: {
        url: "http://localhost:8080/apis/studio/v1"
    },
    ui: {
        contextPath: "/",
        navPrefixPath: "/"
    },
    auth: {
        type: "keycloakjs",
        rbacEnabled: true,
        obacEnabled: false,
        options: {
            url: "https://studio-auth.apicur.io/auth",
            realm: "apicurio-local",
            clientId:"apicurio-studio",
            onLoad: "login-required"
        }
    },
    features: {
        breadcrumbs: true
    }
};
