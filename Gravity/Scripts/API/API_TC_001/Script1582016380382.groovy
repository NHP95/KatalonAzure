import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

KeywordUtil.logInfo("Verify response code")
WS.verifyEqual(200, 200)

