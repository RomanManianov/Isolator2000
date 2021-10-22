package rap.gangsta.mdmintegration.service.assistive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;
import rap.gangsta.general.ifaces.mdm.MdmCreateService;
import rap.gangsta.mdmintegration.configuration.MdmPaths;

@Service
public class RestCreateMdmService implements MdmCreateService {

    private final MdmPaths mdmPaths;

    @Autowired
    public RestCreateMdmService(MdmPaths mdmPaths) {
        this.mdmPaths = mdmPaths;
    }

    @Override
    public MdmItemDtoResponse createItem() {
        return null;
    }

    @Override
    public MdmItemDetailDtoResponse createItemDetail() {
        return null;
    }
}
