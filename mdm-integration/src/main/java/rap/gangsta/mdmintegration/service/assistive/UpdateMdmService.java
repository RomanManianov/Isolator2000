package rap.gangsta.mdmintegration.service.assistive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;
import rap.gangsta.mdmintegration.configuration.MdmPaths;

@Service
@Qualifier("updateMdmService")
public class UpdateMdmService implements AssistiveMdmService{

    private final MdmPaths mdmPaths;

    @Autowired
    public UpdateMdmService(MdmPaths mdmPaths) {
        this.mdmPaths = mdmPaths;
    }

    public MdmItemDtoResponse updateItem() {
        return null;
    }

    public MdmItemDetailDtoResponse updateItemDetail() {
        return null;
    }
}
