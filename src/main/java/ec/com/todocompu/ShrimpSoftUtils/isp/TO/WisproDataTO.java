/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.isp.TO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Transient;

/**
 *
 * @author Trabajo
 */
public class WisproDataTO implements Serializable {

    String coverage_id = null;
    String ceil_dfl_percent = null;
    String dhcp_mac_address = null;
    String latitude;
    String address_state;
    String dhcp_server;
    String created_at;
    String cable_modem_gateway;
    String address_additional_data;
    String client_id;
    String public_id;
    String pppoe_password;
    String server_configuration_id;
    String updated_at;
    String netmask;
    String mac_address;
    Boolean cable_modem_enabled = false;
    Boolean dhcp_mac_defined_by_service = false;
    Boolean pppoe_enabled = true;
    String ppp_profile_id;
    String details;
    String id;
    String state;
    String start_date;
    String cpe_port;
    String longitude;
    String mikrotik_interface_id;
    String address_country;
    String ip;
    String node_name;
    String pppoe_username;
    String address_number;
    String address_city;
    Boolean dhcp_enabled = false;
    String cpe_protocol;
    String address_street;
    String cable_modem_mac_address;
    String plan_id;
    String cable_modem_ip;
    String node_id;
    @Transient
    String cliCodigo;
    @Transient
    String cliId;
    @Transient
    String cliNombre;
    @Transient
    String address;
    @Transient
    Date cliFechaCorte;

    public WisproDataTO() {
    }

    public String getCoverage_id() {
        return coverage_id;
    }

    public void setCoverage_id(String coverage_id) {
        this.coverage_id = coverage_id;
    }

    public String getCeil_dfl_percent() {
        return ceil_dfl_percent;
    }

    public void setCeil_dfl_percent(String ceil_dfl_percent) {
        this.ceil_dfl_percent = ceil_dfl_percent;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDhcp_mac_address() {
        return dhcp_mac_address;
    }

    public void setDhcp_mac_address(String dhcp_mac_address) {
        this.dhcp_mac_address = dhcp_mac_address;
    }

    public String getAddress_state() {
        return address_state;
    }

    public void setAddress_state(String address_state) {
        this.address_state = address_state;
    }

    public String getDhcp_server() {
        return dhcp_server;
    }

    public void setDhcp_server(String dhcp_server) {
        this.dhcp_server = dhcp_server;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCable_modem_gateway() {
        return cable_modem_gateway;
    }

    public void setCable_modem_gateway(String cable_modem_gateway) {
        this.cable_modem_gateway = cable_modem_gateway;
    }

    public String getAddress_additional_data() {
        return address_additional_data;
    }

    public void setAddress_additional_data(String address_additional_data) {
        this.address_additional_data = address_additional_data;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getPublic_id() {
        return public_id;
    }

    public void setPublic_id(String public_id) {
        this.public_id = public_id;
    }

    public String getPppoe_password() {
        return pppoe_password;
    }

    public void setPppoe_password(String pppoe_password) {
        this.pppoe_password = pppoe_password;
    }

    public String getServer_configuration_id() {
        return server_configuration_id;
    }

    public void setServer_configuration_id(String server_configuration_id) {
        this.server_configuration_id = server_configuration_id;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public String getMac_address() {
        return mac_address;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public Boolean getCable_modem_enabled() {
        return cable_modem_enabled;
    }

    public void setCable_modem_enabled(Boolean cable_modem_enabled) {
        this.cable_modem_enabled = cable_modem_enabled;
    }

    public Boolean getDhcp_mac_defined_by_service() {
        return dhcp_mac_defined_by_service;
    }

    public void setDhcp_mac_defined_by_service(Boolean dhcp_mac_defined_by_service) {
        this.dhcp_mac_defined_by_service = dhcp_mac_defined_by_service;
    }

    public Boolean getPppoe_enabled() {
        return pppoe_enabled;
    }

    public void setPppoe_enabled(Boolean pppoe_enabled) {
        this.pppoe_enabled = pppoe_enabled;
    }

    public String getPpp_profile_id() {
        return ppp_profile_id;
    }

    public void setPpp_profile_id(String ppp_profile_id) {
        this.ppp_profile_id = ppp_profile_id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getCpe_port() {
        return cpe_port;
    }

    public void setCpe_port(String cpe_port) {
        this.cpe_port = cpe_port;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getMikrotik_interface_id() {
        return mikrotik_interface_id;
    }

    public void setMikrotik_interface_id(String mikrotik_interface_id) {
        this.mikrotik_interface_id = mikrotik_interface_id;
    }

    public String getAddress_country() {
        return address_country;
    }

    public void setAddress_country(String address_country) {
        this.address_country = address_country;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    public String getPppoe_username() {
        return pppoe_username;
    }

    public void setPppoe_username(String pppoe_username) {
        this.pppoe_username = pppoe_username;
    }

    public String getAddress_number() {
        return address_number;
    }

    public void setAddress_number(String address_number) {
        this.address_number = address_number;
    }

    public String getAddress_city() {
        return address_city;
    }

    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }

    public Boolean getDhcp_enabled() {
        return dhcp_enabled;
    }

    public void setDhcp_enabled(Boolean dhcp_enabled) {
        this.dhcp_enabled = dhcp_enabled;
    }

    public String getCpe_protocol() {
        return cpe_protocol;
    }

    public void setCpe_protocol(String cpe_protocol) {
        this.cpe_protocol = cpe_protocol;
    }

    public String getAddress_street() {
        return address_street;
    }

    public void setAddress_street(String address_street) {
        this.address_street = address_street;
    }

    public String getCable_modem_mac_address() {
        return cable_modem_mac_address;
    }

    public void setCable_modem_mac_address(String cable_modem_mac_address) {
        this.cable_modem_mac_address = cable_modem_mac_address;
    }

    public String getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(String plan_id) {
        this.plan_id = plan_id;
    }

    public String getCable_modem_ip() {
        return cable_modem_ip;
    }

    public void setCable_modem_ip(String cable_modem_ip) {
        this.cable_modem_ip = cable_modem_ip;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        this.cliId = cliId;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCliFechaCorte() {
        return cliFechaCorte;
    }

    public void setCliFechaCorte(Date cliFechaCorte) {
        this.cliFechaCorte = cliFechaCorte;
    }

}
