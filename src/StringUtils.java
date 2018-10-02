public class StringUtils {
    /**
     * makePurdueUsername -- <= 8-letter-long lowercase username creator
     * Usernames may be AT MOST 8 letters in length, and should
     * consist of the first letter of one's first name, and the 
     * amount of their last name that will fit into the remaining
     * 7 characters. All should be lowercase.
     * Ex: a = "Sean ", b = "Flannery", returns "sflanner"
     */
    //yes
    public static String makePurdueUsername(String firstName, String lastName) {
        /* Generate the long version of the name first:
            Ex: firstName = "Sean", lastName = "Flannery"
                    --> res = "SFlannery"
         */
        if(lastName.indexOf('-') > 0){
            lastName = lastName.substring(0,lastName.indexOf('-'));
        }
        String res = firstName.substring(0,1) + lastName;
        /* Shorten the string to 8 characters
            Ex: res = "SFlannery"
                    --> res = "SFlanner"
         */
        if(res.length() > 8) {
            res.substring(0, 8);
        }
        /* Convert the name to lower-case
            Ex: res = "SFlanner"
                    --> res = "sflanner"
         */
        res = res.toLowerCase();
        /* return the result of our calculation */
        return res;
    }

    /**
     * replaceStudentUsername -- replace student usernames in sensitive text
     * We want to make sure student information is expunged from sensitive
     * documents as much as possible. 
     * Ex: text = "jframes was among the students whose SSNs were leaked.",
     * username = "[DATA EXPUNGED] was among the students whose SSNs were leaked.",
     */
    public static String replaceStudentUsername(String text, String username) {
        /* Replace every instance of the username with proper message */
        return text.replaceAll(username, "[DATA EXPUNGED]");
    }
}