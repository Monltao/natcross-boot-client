package person.pluto.natcrossclient;

import lombok.extern.slf4j.Slf4j;
import person.pluto.natcross.common.NatcrossConstants;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>
 * natcross通用参数
 * </p>
 *
 * @author wangmin1994@qq.com
 * @since 2019-03-28 11:01:04
 */
@Slf4j
@Component
@ConfigurationProperties(prefix = "natcross.client.constants")
public class NatcrossSpringConstants {

    public static String HTTP_SERVER = null;

    public void setHTTP_SERVER(String hTTP_SERVER) {
        HTTP_SERVER = hTTP_SERVER;
        log.trace("HTTP_SERVER[{}]", HTTP_SERVER);
    }

    public void setSTREAM_CACHE_SIZE(Integer sTREAM_CACHE_SIZE) {
        NatcrossConstants.STREAM_CACHE_SIZE = sTREAM_CACHE_SIZE;
        log.trace("STREAM_CACHE_SIZE[{}]", NatcrossConstants.STREAM_CACHE_SIZE);
    }

    public void setCLIENT_SERVER_IP(String cLIENT_SERVER_IP) {
        NatcrossConstants.CLIENT_SERVER_IP = cLIENT_SERVER_IP;
        log.trace("CLIENT_SERVER_IP[{}]", NatcrossConstants.CLIENT_SERVER_IP);
    }

    public void setCLIENT_SERVER_PORT(Integer cLIENT_SERVER_PORT) {
        NatcrossConstants.CLIENT_SERVER_PORT = cLIENT_SERVER_PORT;
        log.trace("CLIENT_SERVER_PORT[{}]", NatcrossConstants.CLIENT_SERVER_PORT);
    }

    public void setCLIENT_HEART_INTERVAL(Long cLIENT_HEART_INTERVAL) {
        NatcrossConstants.CLIENT_HEART_INTERVAL = cLIENT_HEART_INTERVAL;
        log.trace("CLIENT_HEART_INTERVAL[{}]", NatcrossConstants.CLIENT_HEART_INTERVAL);
    }

    public void setTRY_RECLIENT_COUNT(Integer tRY_RECLIENT_COUNT) {
        NatcrossConstants.TRY_RECLIENT_COUNT = tRY_RECLIENT_COUNT;
        log.trace("TRY_RECLIENT_COUNT[{}]", NatcrossConstants.TRY_RECLIENT_COUNT);
    }

}
