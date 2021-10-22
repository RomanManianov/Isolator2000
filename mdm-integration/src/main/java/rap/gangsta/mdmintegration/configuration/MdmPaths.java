package rap.gangsta.mdmintegration.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Component
public class MdmPaths {

    @Value("${mdm-adapter.base-url}")
    private String baseUrl;
    @Value("${mdm-adapter.catalogs-url}")
    private String catalogsUrl;
    @Value("${mdm-adapter.catalogs-create-or-update}")
    private String catalogsCreateOrUpdate;
    @Value("${mdm-adapter.document-items-fileuuid}")
    private String documentItemsFileUuid;
    @Value("${mdm-adapter.catalogs-detail-items-url}")
    private String catalogsDetailUrl;
    @Value("${mdm-adapter.catalogs-detail-items-uuid-url}")
    private String catalogDetailUuidUrl;
    @Value("${mdm-adapter.catalogs-detail-search-url}")
    private String catalogsDetailSearchUrl;
    @Value("${mdm-adapter.catalogs-detail-fields-url}")
    protected String catalogsDetailFieldsUrl;
    @Value("${mdm-adapter.catalogs-fields-url}")
    protected String catalogsFieldsUrl;
    @Value("${mdm-adapter.catalogs-items-url}")
    private String catalogsItemsUrl;
    @Value("${mdm-adapter.catalogs-items-access-url}")
    private String catalogsItemsAccessUrl;
    @Value("${mdm-adapter.catalogs-search-url}")
    private String catalogsSearchUrl;
    @Value("${mdm-adapter.order-url}")
    private String orderUrl;
    @Value("${mdm-adapter.transport-subsidy-url}")
    private String transportSubsidyUrl;
    @Value("${mdm-adapter.transport-subsidy-msh-url}")
    private String transportSubsidyMSHUrl;
    @Value("${mdm-adapter.org-url}")
    private String orgUrl;
    @Value("${mdm-adapter.country-url}")
    private String countryUrl;
    @Value("${mdm-adapter.industry-url}")
    private String industryUrl;
    @Value("${mdm-adapter.currency-rate-url}")
    private String currencyRateUrl;
    @Value("${mdm-adapter.currency-url}")
    private String currencyUrl;
    @Value("${mdm-adapter.user-profile-url}")
    private String userProfileUrl;
    @Value("${mdm-adapter.current-user-profile-url}")
    private String currentUserProfileUrl;
    @Value("${mdm-adapter.event_service-url}")
    private String eventServiceUrl;
    @Value("${mdm-adapter.event_all_services-url}")
    private String eventAllServicesUrl;
    @Value("${mdm-adapter.activity-url}")
    private String activityUrl;
    @Value("${mdm-adapter.activities-url}")
    private String activitiesUrl;
    @Value("${mdm-adapter.estimate-url}")
    private String estimateUrl;
    @Value("${mdm-adapter.contract-rec-operator-url}")
    private String contractRecOperatorUrl;
    @Value("${mdm-adapter.contract-rec-operator-list-url}")
    private String contractRecOperatorListUrl;
    @Value("${mdm-adapter.commercial-proposal-url}")
    private String commercialProposalUrl;
    @Value("${mdm-adapter.contract-exporter-operator-url}")
    private String contractExporterOperatorUrl;
    @Value("${mdm-adapter.act-exporter-operator-url}")
    private String actExporterOperatorUrl;
    @Value("${mdm-adapter.catalog-link-url}")
    protected String catalogLinkUrl;
    @Value("${mdm-adapter.counterparty-process-search-url}")
    private String counterpartyProcessSearchUrl;
    @Value("${mdm-adapter.zero-rate-alert-all-url}")
    private String zeroRateAlertsUrl;
}
