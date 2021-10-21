package rap.gangsta.mdmintegration.service.assistive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;
import rap.gangsta.mdmintegration.configuration.MdmPaths;

@Service
@Qualifier("createMdmService")
public class CreateMdmService implements AssistiveMdmService{

    private final MdmPaths mdmPaths;

    @Autowired
    public CreateMdmService(MdmPaths mdmPaths) {
        this.mdmPaths = mdmPaths;
    }

    public MdmItemDtoResponse createItem() {
        return null;
    }

    public MdmItemDetailDtoResponse createItemDetail() {
        return null;
    }
}
