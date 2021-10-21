package rap.gangsta.mdmintegration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;
import rap.gangsta.general.ifaces.mdm.MdmApiService;
import rap.gangsta.mdmintegration.configuration.MdmPaths;
import rap.gangsta.mdmintegration.service.assistive.*;

import java.util.List;
import java.util.Map;

@Service
public class RestMdmApiService implements MdmApiService {

    private final Map<String, AssistiveMdmService> mdmServices;

    @Autowired
    public RestMdmApiService(Map<String, AssistiveMdmService> mdmServices) {
        this.mdmServices = mdmServices;
    }

    @Override
    public MdmItemDtoResponse loadItem() {
        var loadService = (LoadMdmService) mdmServices.get(AssistiveMdmServices.LOAD.getServiceName());
        return loadService.loadItem();
    }

    @Override
    public MdmItemDetailDtoResponse loadItemDetail() {
        var loadService = (LoadMdmService) mdmServices.get(AssistiveMdmServices.LOAD.getServiceName());
        return loadService.loadItemDetail();
    }

    @Override
    public MdmItemDtoResponse createItem() {
        var createService = (CreateMdmService) mdmServices.get(AssistiveMdmServices.CREATE.getServiceName());
        return createService.createItem();
    }

    @Override
    public MdmItemDetailDtoResponse createItemDetail() {
        var createService = (CreateMdmService) mdmServices.get(AssistiveMdmServices.CREATE.getServiceName());
        return createService.createItemDetail();
    }

    @Override
    public MdmItemDtoResponse updateItem() {
        var updateService = (UpdateMdmService) mdmServices.get(AssistiveMdmServices.UPDATE.getServiceName());
        return updateService.updateItem();
    }

    @Override
    public MdmItemDetailDtoResponse updateItemDetail() {
        var updateService = (UpdateMdmService) mdmServices.get(AssistiveMdmServices.UPDATE.getServiceName());
        return updateService.updateItemDetail();
    }

    @Override
    public MdmItemDtoResponse deleteItem() {
        var deleteService = (DeleteMdmService) mdmServices.get(AssistiveMdmServices.DELETE.getServiceName());
        return deleteService.deleteItem();
    }

    @Override
    public MdmItemDetailDtoResponse deleteItemDetail() {
        var deleteService = (DeleteMdmService) mdmServices.get(AssistiveMdmServices.DELETE.getServiceName());
        return deleteService.deleteItemDetail();
    }

    @Override
    public List<MdmItemDtoResponse> listItem() {
        var listService = (ListMdmService) mdmServices.get(AssistiveMdmServices.LIST.getServiceName());
        return listService.listItem();
    }

    @Override
    public List<MdmItemDetailDtoResponse> listItemDetail() {
        var listService = (ListMdmService) mdmServices.get(AssistiveMdmServices.LIST.getServiceName());
        return listService.listItemDetail();
    }
}
