resource "azurerm_service_plan" "asp" {
    name = var.app_service_plan_id
    resource_group_name = var.resource_group_name
    location = var.location
    os_type = "Windows"
    sku_name = "B1"

}