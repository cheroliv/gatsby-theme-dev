import React from "react"
import { graphql } from "gatsby"
import DocsPage from "../components/docs-page"

export const query = graphql`
  query($pageID: String!) {
    docsPage(id: { eq: $pageID }) {
      title
      updated(fromNow: true)
      body
    }
  }
`

const DocsPageTemplate = ({ data: { docsPage } }) => <DocsPage page={docsPage} />

export default DocsPageTemplate
