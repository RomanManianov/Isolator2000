package rap.gangsta.general.ifaces.mdm;

import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;

public interface MdmLoadService {

    MdmItemDtoResponse loadItem();

    MdmItemDetailDtoResponse loadItemDetail();
}
