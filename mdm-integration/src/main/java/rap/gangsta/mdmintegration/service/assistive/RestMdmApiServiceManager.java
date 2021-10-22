package rap.gangsta.mdmintegration.service.assistive;

import org.intellij.lang.annotations.JdkConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rap.gangsta.general.ifaces.mdm.MdmServiceManager;

@Service
public class RestMdmApiServiceManager implements MdmServiceManager {

    private final RestCreateMdmService createMdmService;
    private final RestDeleteMdmService deleteMdmService;
    private final RestListMdmService listMdmService;
    private final RestUpdateMdmService updateMdmService;
    private final RestLoadMdmService loadMdmService;

    @Autowired
    public RestMdmApiServiceManager(RestCreateMdmService createMdmService, RestDeleteMdmService deleteMdmService, RestListMdmService listMdmService, RestUpdateMdmService updateMdmService, RestLoadMdmService loadMdmService) {
        this.createMdmService = createMdmService;
        this.deleteMdmService = deleteMdmService;
        this.listMdmService = listMdmService;
        this.updateMdmService = updateMdmService;
        this.loadMdmService = loadMdmService;
    }

    @Override
    public RestCreateMdmService getCreateService() {
        return createMdmService;
    }

    @Override
    public RestDeleteMdmService getDeleteService() {
        return deleteMdmService;
    }

    @Override
    public RestListMdmService getListService() {
        return listMdmService;
    }

    @Override
    public RestUpdateMdmService getUpdateService() {
        return updateMdmService;
    }

    @Override
    public RestLoadMdmService getLoadService() {
        return loadMdmService;
    }
}
