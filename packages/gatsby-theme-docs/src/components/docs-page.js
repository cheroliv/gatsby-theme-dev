/** @jsx jsx */
import { jsx } from "theme-ui"
import { MDXRenderer } from "gatsby-plugin-mdx"
import Layout from "./layout"
import TableOfContents from "./table-of-contents"

const DocsPage = ({ page: { body, title, updated } }) =>
  <Layout>
    <h1>{title}</h1>
    <MDXRenderer>{body}</MDXRenderer>
    <p sx={{
      borderTop: ({ colors: { muted } }) => `1px solid ${muted}`,
      color: "muted",
      fontSize: 14,
      mt: 2,
      pt: 2
    }}> This page was updated {updated}. </p>
    <TableOfContents />
  </Layout>

export default DocsPage
