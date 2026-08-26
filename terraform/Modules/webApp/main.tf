resource "azurerm_windows_web_app" "webapp" {
  name = var.web_app_name
  resource_group_name = var.resource_group_name
  location = var.location
  site_config {always_on = false}
  service_plan_id = var.app_service_plan_id

}