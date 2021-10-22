package rap.gangsta.mdmintegration.service.assistive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;
import rap.gangsta.general.ifaces.mdm.MdmUpdateService;
import rap.gangsta.mdmintegration.configuration.MdmPaths;

@Service
public class RestUpdateMdmService implements MdmUpdateService {

    private final MdmPaths mdmPaths;

    @Autowired
    public RestUpdateMdmService(MdmPaths mdmPaths) {
        this.mdmPaths = mdmPaths;
    }

    @Override
    public MdmItemDtoResponse updateItem() {
        return null;
    }

    @Override
    public MdmItemDetailDtoResponse updateItemDetail() {
        return null;
    }
}
