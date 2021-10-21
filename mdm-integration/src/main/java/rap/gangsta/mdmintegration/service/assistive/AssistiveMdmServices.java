package rap.gangsta.mdmintegration.service.assistive;

import lombok.Getter;

@Getter
public enum AssistiveMdmServices {

    CREATE("createMdmService"),
    DELETE("deleteMdmService"),
    LIST("listMdmService"),
    LOAD("loadMdmService"),
    UPDATE("updateMdmService");

    private final String serviceName;

    AssistiveMdmServices(String serviceName) {
        this.serviceName = serviceName;
    }
}
