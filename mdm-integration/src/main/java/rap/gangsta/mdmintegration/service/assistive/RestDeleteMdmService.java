package rap.gangsta.mdmintegration.service.assistive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;
import rap.gangsta.general.ifaces.mdm.MdmDeleteService;
import rap.gangsta.mdmintegration.configuration.MdmPaths;

@Service
public class RestDeleteMdmService implements MdmDeleteService {

    private final MdmPaths mdmPaths;

    @Autowired
    public RestDeleteMdmService(MdmPaths mdmPaths) {
        this.mdmPaths = mdmPaths;
    }

    @Override
    public MdmItemDtoResponse deleteItem() {
        return null;
    }

    @Override
    public MdmItemDetailDtoResponse deleteItemDetail() {
        return null;
    }
}
