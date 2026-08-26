terraform {
  backend "azurerm" {
    resource_group_name  = "backendRg"
    storage_account_name = "javastorage2002"
    container_name       = "javac2002"
    key                  = "java.terraform.tfstate"

  }
}