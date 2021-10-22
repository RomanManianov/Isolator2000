package rap.gangsta.general.ifaces.mdm;

import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;

public interface MdmDeleteService {

    MdmItemDtoResponse deleteItem();

    MdmItemDetailDtoResponse deleteItemDetail();
}
