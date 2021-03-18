package com.journals.tsijournals.model;

import java.util.List;

public class ArchiveResponse {


    /**
     * archive_year_cnt : 4
     * status : true
     * message : Records Found
     * archive_years : [{"year":"2020","archive_details":[{"year":"2020","vol":"2","issue":"2","vol_issue_name":"8th International Conference and Exhibition on Mechanical and Aerospace","journal":"tsbmbl","vol_issue_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-2-issue-2-year-2020.html","date":"2020-11-03"}]},{"year":"2017","archive_details":[{"year":"2017","vol":"3","issue":"3","vol_issue_name":"Volume 3, Issue 3","journal":"tsbmbl","vol_issue_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-3-issue-3-year-2017.html","date":"2017-10-27"},{"year":"2017","vol":"3","issue":"2","vol_issue_name":"Volume 3, Issue 2","journal":"tsbmbl","vol_issue_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-3-issue-2-year-2017.html","date":"2017-03-30"},{"year":"2017","vol":"3","issue":"1","vol_issue_name":"Volume 3, Issue 1","journal":"tsbmbl","vol_issue_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-3-issue-1-year-2017.html","date":"2017-03-09"}]},{"year":"2016","archive_details":[{"year":"2016","vol":"2","issue":"2","vol_issue_name":"Volume 2, Issue 2","journal":"tsbmbl","vol_issue_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-2-issue-2-year-2016.html","date":"2017-02-16"},{"year":"2016","vol":"2","issue":"1","vol_issue_name":"Volume 2, Issue 1","journal":"tsbmbl","vol_issue_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-2-issue-1-year-2016.html","date":"2016-06-23"}]},{"year":"2015","archive_details":[{"year":"2015","vol":"1","issue":"3","vol_issue_name":"Volume 1, Issue 3","journal":"tsbmbl","vol_issue_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-1-issue-3-year-2015.html","date":"2016-05-09"},{"year":"2015","vol":"1","issue":"2","vol_issue_name":"Volume 1, Issue 2","journal":"tsbmbl","vol_issue_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-1-issue-2-year-2015.html","date":"2016-05-09"},{"year":"2015","vol":"1","issue":"1","vol_issue_name":"Volume 1, Issue 1","journal":"tsbmbl","vol_issue_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-1-issue-1-year-2015.html","date":"2016-05-09"}]}]
     */

    private int archive_year_cnt;
    private boolean status;
    private String message;
    /**
     * year : 2020
     * archive_details : [{"year":"2020","vol":"2","issue":"2","vol_issue_name":"8th International Conference and Exhibition on Mechanical and Aerospace","journal":"tsbmbl","vol_issue_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-2-issue-2-year-2020.html","date":"2020-11-03"}]
     */

    private List<ArchiveYearsBean> archive_years;

    public int getArchive_year_cnt() {
        return archive_year_cnt;
    }

    public void setArchive_year_cnt(int archive_year_cnt) {
        this.archive_year_cnt = archive_year_cnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ArchiveYearsBean> getArchive_years() {
        return archive_years;
    }

    public void setArchive_years(List<ArchiveYearsBean> archive_years) {
        this.archive_years = archive_years;
    }

    public static class ArchiveYearsBean {
        private String year;
        /**
         * year : 2020
         * vol : 2
         * issue : 2
         * vol_issue_name : 8th International Conference and Exhibition on Mechanical and Aerospace
         * journal : tsbmbl
         * vol_issue_url : https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.htmlarchive/tsbmbl-volume-2-issue-2-year-2020.html
         * date : 2020-11-03
         */

        private List<ArchiveDetailsBean> archive_details;

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public List<ArchiveDetailsBean> getArchive_details() {
            return archive_details;
        }

        public void setArchive_details(List<ArchiveDetailsBean> archive_details) {
            this.archive_details = archive_details;
        }

        public static class ArchiveDetailsBean {
            private String year;
            private String vol;
            private String issue;
            private String vol_issue_name;
            private String journal;
            private String vol_issue_url;
            private String date;

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public String getVol() {
                return vol;
            }

            public void setVol(String vol) {
                this.vol = vol;
            }

            public String getIssue() {
                return issue;
            }

            public void setIssue(String issue) {
                this.issue = issue;
            }

            public String getVol_issue_name() {
                return vol_issue_name;
            }

            public void setVol_issue_name(String vol_issue_name) {
                this.vol_issue_name = vol_issue_name;
            }

            public String getJournal() {
                return journal;
            }

            public void setJournal(String journal) {
                this.journal = journal;
            }

            public String getVol_issue_url() {
                return vol_issue_url;
            }

            public void setVol_issue_url(String vol_issue_url) {
                this.vol_issue_url = vol_issue_url;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }
    }
}
