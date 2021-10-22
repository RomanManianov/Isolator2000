package rap.gangsta.mdmintegration.service.assistive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;
import rap.gangsta.general.ifaces.mdm.MdmListService;
import rap.gangsta.mdmintegration.configuration.MdmPaths;

import java.util.List;

@Service
public class RestListMdmService implements MdmListService {

    private final MdmPaths mdmPaths;

    @Autowired
    public RestListMdmService(MdmPaths mdmPaths) {
        this.mdmPaths = mdmPaths;
    }

    @Override
    public List<MdmItemDtoResponse> listItem() {
        return null;
    }

    @Override
    public List<MdmItemDetailDtoResponse> listItemDetail() {
        return null;
    }
}
